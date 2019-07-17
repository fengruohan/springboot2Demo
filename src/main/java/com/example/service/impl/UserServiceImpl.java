package com.example.service.impl;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	 @Autowired
	 private UserMapper userMapper;
	 
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int add(User user) {
		userMapper.insert(user);
		int id = user.getId();
		return id;
	}
	
	
	

	
	
}
