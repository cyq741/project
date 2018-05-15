package com.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.bean.UserRole;

public interface UserRoleService {

	List<UserRole> selectUserWithRoles(@Param("u_id") Integer u_id);
	
}
