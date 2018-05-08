package com.boot.bootdemo.dao;

import com.boot.bootdemo.bean.DbInfo;
import com.boot.bootdemo.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

public interface DBDao extends MyMapper<DbInfo> {
}