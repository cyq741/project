package com.boot.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "th")
public class ThymeleafController {

    @RequestMapping(value = "/index")
    public String index() {
        return "/thymeleaf/index";
    }

    @RequestMapping(value = "center")
    public String center() {
        return "thymeleaf/center/center";
    }

    @RequestMapping(value = "erro")
    public String getException() {
        int i = 1 / 0;
        return "thymeleaf/erro";
    }


}
