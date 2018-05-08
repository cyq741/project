package com.boot.bootdemo.service;

import com.boot.bootdemo.bean.DbInfo;
import com.boot.bootdemo.dao.DBDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DbService implements ServiceInterface<DbInfo> {

    @Autowired
    private DBDao dbDao;
    @Override
    public Integer insert(DbInfo dbInfo) {
        return null;
    }

    @Override
    public List<DbInfo> selectAll() {
        return dbDao.selectAll();
    }

    @Override
    public DbInfo selectById(Integer id) {
        return null;
    }

    @Override
    public List<DbInfo> selectList(DbInfo dbInfo) {
        return null;
    }

    @Override
    public Integer updata(DbInfo dbInfo) {
        return null;
    }

    @Override
    public Integer delete(Integer id) {
        return null;
    }
}
