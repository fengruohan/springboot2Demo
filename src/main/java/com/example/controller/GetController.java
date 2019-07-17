package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.ServerSetting;
import com.example.pojo.User;

@RestController
public class GetController {
	
	private Map<String,Object> params = new HashMap<String,Object>();
	
//	@RequestMapping(path="/{city_id}/{user_id}",method=RequestMethod.GET)	
//	public Object findUser(@PathVariable(value="city_id") String cityId,@PathVariable(value="user_id") String userId) {
//		params.clear();
//		params.put("cityId", cityId);
//		params.put("userId", userId);
//		return params;
//	}
	
	
	@GetMapping("/testGetMapping")
	public Object testGetMapping(@RequestParam(defaultValue="0",name="page") String a1,String a2) {
		params.clear();
		params.put("a1", a1);
		params.put("a2", a2);
		return params;
	}
	
	@RequestMapping("/saveUser")
	public Object saveUser(@RequestBody User user) {
		params.clear();
		params.put("user", user);
		return params;
	}
	
	/**
	 * 测试获取头信息
	 */
	@RequestMapping("/getHeader")
	public Object getHeader(@RequestHeader(name="access_taken") String taken,String id) {
		params.clear();
		params.put("taken", taken);
		params.put("id", id);
		return params;
	}
	@RequestMapping("/getRequest")
	public Object getRequest(HttpServletRequest request) {
		String id = request.getParameter("id");
		params.put("id", id);
		return params;
	}
	
	@Autowired
	private ServerSetting setting;
	
	@GetMapping("/testProperties")
	public Object testProperties() {
		
		params.put("setting", setting);
		return params;
	}
	
	
	@GetMapping("/api/test1")
	public Object test1() {
		
		params.put("setting", setting);
		return params;
	}
}
