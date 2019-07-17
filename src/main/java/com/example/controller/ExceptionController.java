package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.domain.MyException;
import com.example.pojo.JsonData;

@RestController
public class ExceptionController {
	
	
	@RequestMapping("/gopage")
	public Object index() {
		return "index";
	}
	
	@RequestMapping("/gomyexception")
	public Object gomyexception() {
		throw new MyException("500", "异常");
	}

}
