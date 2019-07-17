package com.example.controller;

import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.JsonData;
import com.example.task.AsyncTask;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private AsyncTask asyncTask;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	@GetMapping("/testLog")
	public Object testLog() {
		logger.debug("this is dubug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.error("this is error");
		
		return JsonData.buildSuccess();
	}
	
	@GetMapping("ansy_tast")
	public JsonData exeTask() throws InterruptedException {
		long begin = System.currentTimeMillis();
	//		asyncTask.task1();
	//		asyncTask.task2();
	//		asyncTask.task3();
		
		Future<String> task4 = asyncTask.task4();
		Future<String> task5 = asyncTask.task5();
		Future<String> task6 = asyncTask.task6();
		
		for(; ;) {
			if(task4.isDone()&&task5.isDone()&&task6.isDone()) {
				break;
			}
		}
		
		long end = System.currentTimeMillis();
		long total = end-begin;
		System.out.println("耗时:"+total);
		return JsonData.buildSuccess(total);
	}

}
