package com.example.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//服务器配置

@Component
@PropertySource("classpath:resource.properties")
@ConfigurationProperties(prefix="test")
public class ServerSetting {
	//名称
	//如果使用前缀的话，则不能加@Value("${appname}")
	//@Value("${appname}")
	private String name;
	//域名地址
	//@Value("${domain}")
	private String domain;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	
	

}
