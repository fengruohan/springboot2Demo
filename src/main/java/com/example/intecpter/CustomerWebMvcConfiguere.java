package com.example.intecpter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomerWebMvcConfiguere implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/api/");
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}
	
	

}
