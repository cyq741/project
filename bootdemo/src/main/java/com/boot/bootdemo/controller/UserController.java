package com.boot.bootdemo.controller;

import com.boot.bootdemo.bean.UserInfo;
import com.boot.bootdemo.pojo.DemoResult;
import com.boot.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUsers")
    public DemoResult getUsers() {
        System.out.println("/user/getUsers......");
//        UserService userService = new UserService();
        List<UserInfo> list = userService.selectAll();

        return DemoResult.success(list);
    }
}
