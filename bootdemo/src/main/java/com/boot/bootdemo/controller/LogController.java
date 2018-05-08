package com.boot.bootdemo.controller;

import com.boot.bootdemo.bean.Log;
import com.boot.bootdemo.service.LogService;
import com.boot.bootdemo.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/log")
public class LogController {
    @Autowired
    LogService logService;

    @RequestMapping(value = "/getlogs", method = RequestMethod.GET)
    public String getLogs() {
        List<Log> logs = logService.selectAll();
        String s = JsonUtils.objectToJson(logs);
        System.out.println(s);
        return s;
    }
}
