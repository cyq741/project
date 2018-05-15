package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.dao.UserMapper;
import com.demo.dao.UserRoleMapper;
import com.demo.service.UserRoleService;
import com.demo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tests {
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	UserRoleMapper userRolemapper;

	@Test
	public void daoTest() {
		System.out.println("==========daoTest start===========");
		
//		System.out.println(userMapper.selectByExample(null));
		
		System.out.println(userRolemapper.selectUserWithRoles(18));
		
		System.out.println("==========daoTest end===========");
	}

	@Autowired
	UserService userService;
	@Autowired
	UserRoleService userRoleService;
	
	@Test
	public void serviceTest() {
		System.out.println("==========serviceTest start===========");
		
		System.out.println(userService.selectByName("admin"));
		
		System.out.println(userRoleService.selectUserWithRoles(18));
		System.out.println("==========serviceTest end===========");
	}
	
	
}
