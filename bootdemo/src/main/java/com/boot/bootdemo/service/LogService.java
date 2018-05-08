package com.boot.bootdemo.service;

import com.boot.bootdemo.bean.Log;
import com.boot.bootdemo.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogService implements ServiceInterface<Log> {
    @Autowired
    LogDao logDao;

    @Override
    public Integer insert(Log log) {
        return null;
    }

    @Override
    public List<Log> selectAll() {

        return logDao.selectAll();
    }

    @Override
    public Log selectById(Integer id) {
        return null;
    }

    @Override
    public List<Log> selectList(Log log) {
        return null;
    }

    @Override
    public Integer updata(Log log) {
        return null;
    }

    @Override
    public Integer delete(Integer id) {
        return null;
    }
}
