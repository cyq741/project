package com.boot.bootdemo.service;

import com.boot.bootdemo.bean.UserInfo;
import com.boot.bootdemo.dao.UserDao;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserService implements ServiceInterface<UserInfo> {
    @Autowired
    UserDao userDao;

    @Override
    public Integer insert(UserInfo userInfo) {
        return userDao.insert(userInfo);
    }

    @Override
    public List<UserInfo> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public UserInfo selectById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> selectList(UserInfo userInfo) {
//        PageHelper.startPage(page,pageSize);

//        Example ex= new Example(UserInfo.class);
//        Example.Criteria cri = ex.createCriteria();
        return userDao.select(userInfo);
    }



    @Override
    public Integer updata(UserInfo userInfo) {
        return userDao.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public Integer delete(Integer id) {
        return userDao.deleteByPrimaryKey(id);
    }
}
