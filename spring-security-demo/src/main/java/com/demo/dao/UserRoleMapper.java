package com.demo.dao;

import com.demo.bean.UserRole;
import com.demo.bean.UserRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRoleMapper {
	long countByExample(UserRoleExample example);

	int deleteByExample(UserRoleExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(UserRole record);

	int insertSelective(UserRole record);

	List<UserRole> selectByExample(UserRoleExample example);

	UserRole selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	int updateByPrimaryKeySelective(UserRole record);

	int updateByPrimaryKey(UserRole record);
	
	/* 以下是自定义的方法接口*/
	List<UserRole> selectUserWithRoles(@Param("u_id") Integer u_id);
}