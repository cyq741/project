package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.User;
import com.demo.dao.UserMapper;
import com.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper mapper;
	
	@Override
	public User selectByName(String username) {

		
		return mapper.selectByUserName(username);
	}

}
