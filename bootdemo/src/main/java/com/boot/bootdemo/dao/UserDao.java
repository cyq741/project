package com.boot.bootdemo.dao;

import com.boot.bootdemo.bean.UserInfo;
import com.boot.bootdemo.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

public interface UserDao extends MyMapper<UserInfo> {


}