package com.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeartCheckController {
    @GetMapping("/index")
    public String sayHello(){
        return "index";
    }
}
