package com.cy.db.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/doIndexUI")
    public String doIndexUI(){
        return "starter";
    }

//    @RequestMapping("log/log_list")
//    public String doModuleUI(){
//        return "sys/log_list";
//    }

    @RequestMapping("/{module}/{moduleUI}")
    public String doModuleUI(@PathVariable String moduleUI){
        return "sys/"+moduleUI;
    }

    @RequestMapping("/doPageUI")
    public String doPageUI(){
        return "common/page";
    }

}
