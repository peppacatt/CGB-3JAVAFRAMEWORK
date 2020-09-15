package com.cy.db.sys.controller;

import com.cy.db.sys.common.pojo.JsonResult;
import com.cy.db.sys.pojo.SysRole;
import com.cy.db.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role/")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("doFindPageObjects")
    public JsonResult doFindPageObjects(String name, Long pageCurrent){
        return new JsonResult(sysRoleService.findPageObjects(name, pageCurrent));
    }

    @RequestMapping("doFindRoles")
    public JsonResult doFindRoles(){
        return new JsonResult(sysRoleService.findRoles());
    }

    @RequestMapping("doFindObjectById")
    public JsonResult doFindObjectById(Integer id){
        return new JsonResult(sysRoleService.findObjectById(id));
    }

    @RequestMapping("doSaveObject")
    public JsonResult doInsertObjects(SysRole entity, Integer[] menuIds){
        sysRoleService.insertObjects(entity, menuIds);
        return new JsonResult("insert ok");
    }

    @RequestMapping("doUpdateObject")
    public JsonResult doUpdateObjects(SysRole entity, Integer[] menuIds){
        sysRoleService.updateObjects(entity, menuIds);
        return new JsonResult("update ok");
    }

}
