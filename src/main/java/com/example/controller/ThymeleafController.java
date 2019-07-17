package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.ServerSetting;

@Controller
@RequestMapping("/thymyleaf")
public class ThymeleafController {
	
	
	@Autowired
	private ServerSetting setting;
	
	@RequestMapping("index")
	public String index() {
		return "tl/index";
	}
	

}
