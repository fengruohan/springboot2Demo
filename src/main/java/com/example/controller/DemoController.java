package com.example.controller;

import java.util.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pojo.User;
@Controller
public class DemoController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "hello world";
	}
	
	@GetMapping("/test/home")
	@ResponseBody
	public Object testhome() {
		
		
		return "xdclass";
	}
	

	@RequestMapping("/testjson")
	@ResponseBody
	public Object testjson() {
		
		
		return new User("北京","璐璐","123",new Date());
	}
	
}
