package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.UserRole;
import com.demo.dao.UserRoleMapper;
import com.demo.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {
	@Autowired
	UserRoleMapper mapper;
	
	@Override
	public List<UserRole> selectUserWithRoles(Integer u_id) {
		// TODO Auto-generated method stub
		return mapper.selectUserWithRoles(u_id);
	}

}
