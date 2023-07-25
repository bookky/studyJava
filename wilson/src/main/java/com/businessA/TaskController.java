package com.businessA;

import com.businessA.operation.StartTaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 2023/7/18
 * 0:52
 * 2023
 **/
@Controller
public class TaskController {


    @GetMapping("/index")
    public String sayHello(){
        return "index";
    }

}
