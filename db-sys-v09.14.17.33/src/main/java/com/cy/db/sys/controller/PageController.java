package com.cy.db.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

    @RequestMapping("doIndexUI")
    public String doIndexUI() {
        return "starter";
    }

    @RequestMapping("doPageUI")
    public String doPageUI() {
        return "common/page";
    }

    @RequestMapping("{module}/{moduleUI}")
    public String doModuleUI(@PathVariable String moduleUI) {
        return "sys/" + moduleUI;
    }

}
