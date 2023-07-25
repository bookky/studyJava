package com.business.controller;

import com.business.service.GenericAService;
import com.business.service.GenericBService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Resource private GenericAService genericAService;
    @Resource private GenericBService genericBService;

    @RequestMapping("/getGenericA")
    @ResponseBody
    public String getGenericA(){
        return genericAService.getGenericA();
    }
    @RequestMapping("/getGenericB")
    @ResponseBody
    public String getGenericB(){
        return genericBService.getGenericB();
    }
    @RequestMapping("/getGenericC")
    @ResponseBody
    public String getGenericC(){
        return genericBService.getGenericC();
    }
    @RequestMapping("/getGenericD")
    @ResponseBody
    public String getGenericD(){
        return genericBService.getGenericD();
    }


}
