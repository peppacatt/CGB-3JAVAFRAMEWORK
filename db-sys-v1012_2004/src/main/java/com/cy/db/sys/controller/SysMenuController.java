package com.cy.db.sys.controller;

import com.cy.db.common.vo.JsonResult;
import com.cy.db.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("/doFindObjects")
    public JsonResult doFindObjects(){
        return new JsonResult(sysMenuService.findMenuObject());
    }

    @RequestMapping("/doDeleteObject")
    public JsonResult doDeleteObject(Integer id){
        sysMenuService.deleteCheckedMenuObject(id);
        return new JsonResult("delete ok");
    }

}
