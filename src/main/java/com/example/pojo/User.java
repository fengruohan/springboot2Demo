package com.example.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;


public class User {
	
	//空字段不返回
	//@JsonInclude(Include.NON_NULL)
	private int age;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//别名
	//@JsonProperty("dress")
	private String add;
	private String name;
	
	//@JsonIgnore
	private String pwd;
	
	//@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
	private Date creatTime;
	
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", add=" + add + ", name=" + name + ", pwd=" + pwd + ", creatTime=" + creatTime
				+ "]";
	}
	public User(String add, String name, String pwd, Date creatTime) {
		super();
		
		this.add = add;
		this.name = name;
		this.pwd = pwd;
		this.creatTime = creatTime;
	}
	public User() {
		super();
	}
	
	
	

}
