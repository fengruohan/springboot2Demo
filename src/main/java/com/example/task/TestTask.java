package com.example.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务业务类
 * @author 86182
 *
 */
@Component
public class TestTask {
//	@Scheduled(fixedRate=2000)
	public void sum() {
		
		System.out.println("当前时间:"+new Date());
	}

}
