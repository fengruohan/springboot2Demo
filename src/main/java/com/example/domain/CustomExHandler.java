package com.example.domain;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@RestControllerAdvice
public class CustomExHandler {
	
	//private static final Logger log = LoggerFactory.getLogger(CustomExHandler.class);
	
	@ExceptionHandler(value=Exception.class)
	Object handleException(Exception e,HttpServletRequest request) {
	//	log.error("url { "+request.getRequestURL()+"},msg {"+e.getMessage()+" }");
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", 100);
		map.put("msg", e.getMessage());
		map.put("url", request.getRequestURL());
		
		return map;
	}
	@ExceptionHandler(value=MyException.class)
	Object handleMyException(MyException e,HttpServletRequest request) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("error.html");
//		mv.addObject(e.getMessage());
//		return mv;

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", e.getCode());
		map.put("msg", e.getMsg());
		map.put("url", request.getRequestURL());
		return map;
	}
	
	
	

}
