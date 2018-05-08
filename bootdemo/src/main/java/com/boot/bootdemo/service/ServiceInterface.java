package com.boot.bootdemo.service;

import java.util.List;

public interface ServiceInterface<T> {

    public  Integer insert(T t);

    public List<T> selectAll();

    public T selectById(Integer id);

    public List<T> selectList(T t);

    public Integer updata(T t);

    public Integer delete(Integer id);
}
