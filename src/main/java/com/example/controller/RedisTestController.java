package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.JsonData;
import com.example.pojo.User;
import com.example.utils.JsonUtils;
import com.example.utils.RedisClient;

@RestController
@RequestMapping("/redis")
public class RedisTestController {
	
	@Autowired
	private StringRedisTemplate redisTpl;
	@Autowired
	private RedisClient redis;
	
	@GetMapping("add")
	public Object add() {
		//redisTpl.opsForValue().set("age", "10");
		redis.set("add", "北京");
		return JsonData.buildSuccess("ok");
	}

	
	@GetMapping("get")
	public Object get() {
		//String age = redisTpl.opsForValue().get("age");
		String age = redis.get("add");
		return JsonData.buildSuccess(age);
	}
	
	
	@GetMapping("save_user")
	public Object save_user() {
		//String age = redisTpl.opsForValue().get("age");
		User user = new User("北京", "张三", "123", new Date());
		String userstr = JsonUtils.obj2String(user);
		boolean flag = redis.set("user", userstr);
		return JsonData.buildSuccess(flag);
	}
	
	@GetMapping("find_user")
	public Object find_user() {
	
		//String age = redis.get("add");
		String userstr = redis.get("user");
		User user = JsonUtils.string2Obj(userstr, User.class);
		return JsonData.buildSuccess(user);
	}
}
