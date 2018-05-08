package com.boot.bootdemo.dao;

import com.boot.bootdemo.bean.Log;
import com.boot.bootdemo.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

public interface LogDao extends MyMapper<Log> {
}