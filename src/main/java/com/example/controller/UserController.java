package com.example.controller;


import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.JsonData;
import com.example.pojo.User;
import com.example.service.UserService;

/**
 *@作者 小D课堂  小D
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	/**
	 * 功能描述: user 保存接口
	 * @return
	 */
	@GetMapping("add")
	public Object add(){
		
		User user = new User();
		user.setAge(11);
		user.setCreatTime(new Date());
		user.setName("xdclass");
		user.setPwd("222");
		int id = userService.add(user);
		
       return JsonData.buildSuccess(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired
//	private UserMapper userMapper;
//	
//	
//	
//	@GetMapping("findAll")
//	public Object findAll(){
//		
//       return JsonData.buildSuccess(userMapper.getAll());
//	}
//	
//	
//	
//	@GetMapping("findById")
//	public Object findById(long id){
//       return JsonData.buildSuccess(userMapper.findById(id));
//	}
//	
//	
//	@GetMapping("del_by_id")
//	public Object delById(long id){
//	userMapper.delete(id);
//       return JsonData.buildSuccess();
//	}
//	
//	@GetMapping("update")
//	public Object update(String name,int id){
//		User user = new User();
//		user.setName(name);
//		user.setId(id);
//		userMapper.update(user);
//	    return JsonData.buildSuccess();
//	}
//	
	
	
	
	
	
//	//测试事务
//	@GetMapping("transac")
//	public Object transac(){
//		int id = userService.addAccount();
//	    return JsonData.buildSuccess(id);
//	}
//	
//	
	
	
}
