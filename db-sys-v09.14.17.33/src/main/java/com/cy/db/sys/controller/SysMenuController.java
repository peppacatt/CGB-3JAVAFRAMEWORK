package com.cy.db.sys.controller;

import com.cy.db.sys.common.pojo.JsonResult;
import com.cy.db.sys.pojo.SysMenu;
import com.cy.db.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu/")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("doFindObjects")
    public JsonResult doFindObjects(){
        return new JsonResult(sysMenuService.findObjects());
    }

    @RequestMapping("doDeleteObjects")
    public JsonResult doDeleteObjects(Integer id){
        sysMenuService.deleteObjects(id);
        return new JsonResult("delete ok...");
    }

    @RequestMapping("doFindZtreeMenuNodes")
    public JsonResult doFindZtreeMenuNodes(){
        return new JsonResult(sysMenuService.findZtreeMenuNodes());
    }

    @RequestMapping("doInsertObjects")
    public JsonResult doInsertObjects(SysMenu entity){
        sysMenuService.inserObjects(entity);
        return new JsonResult("insert ok");
    }

    public JsonResult doUpdateObjects(SysMenu entity){
        sysMenuService.updateObjects(entity);
        return new JsonResult("delete ok");
    }

}
