package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherHttpController {
	private Map<String,Object> params = new HashMap<String,Object>();
	
	@PostMapping("/login")
	public Object login(String id,String pwd) {
		params.clear();
		params.put("id", id);
		params.put("pwd", pwd);
		return params;
	}
	@PutMapping("/put")
	public Object put(String id) {
		params.clear();
		params.put("id", id);
		return params;	
	}
	@DeleteMapping("/delete")
	public Object delete(String id) {
		params.clear();
		params.put("id", id);
		return params;
	}
	

}
