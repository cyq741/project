package com.boot.bootdemo.controller;

import com.boot.bootdemo.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "ftl")
public class FreemarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping(value = "/index")
    public String index(ModelMap map) {
        map.addAttribute("resource",resource);
        return "freemarker/index";
    }

    @RequestMapping(value = "/center")
    public String center(){
        System.out.println("center.....");
        return "freemarker/center/center";
    }

}
