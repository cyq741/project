package com.boot.bootdemo.controller;

import com.boot.bootdemo.pojo.DemoResult;
import com.boot.bootdemo.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/h")
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello SpringBoot!!!";
    }

    @RequestMapping(value = "/getResource", method = RequestMethod.GET)
    public DemoResult getRource() {

        Resource bean = new Resource();

        BeanUtils.copyProperties(resource,bean);

        return DemoResult.success(bean);
    }
}
