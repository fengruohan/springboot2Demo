package com.example.demo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartFile;
@SpringBootApplication(scanBasePackages= {"com.example"})
@ServletComponentScan(basePackages= {"com.example"})
@MapperScan(basePackages= {"com.example.mapper"})
@EnableScheduling //开启定时任务
@EnableAsync      //开启异步任务
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	//这要放在含有@Configuration注解的类中
		@Bean
		public MultipartConfigElement multipartConfigElement() {
			MultipartConfigFactory factory = new MultipartConfigFactory();
			//单个文件大小
			factory.setMaxFileSize("1024KB");//KB,MB
			//设置总上传数据大小
			factory.setMaxRequestSize("1024000KB");
			
			return factory.createMultipartConfig();
		}
		
}
