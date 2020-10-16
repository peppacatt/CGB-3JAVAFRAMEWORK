package com.cy.db.sys.controller;

import com.cy.db.common.po.SysRole;
import com.cy.db.common.vo.JsonResult;
import com.cy.db.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/doFindPageObjects")
    public JsonResult doFindPageObjects(String name, Long pageCurrent){
        return new JsonResult(sysRoleService.findPageObject(name, pageCurrent));
    }

    @RequestMapping("/doSaveObject")
    public  JsonResult doSaveObject(SysRole entity, Integer... menuIds){
        sysRoleService.saveRoleObject(entity, menuIds);
        return new JsonResult("save ok");
    }

    @RequestMapping("/doFindObjectById")
    public JsonResult doFindObjectById(Integer id){
        return new JsonResult(sysRoleService.findRoleMenuObject(id));
    }

    @RequestMapping("/doUpdateObject")
    public JsonResult doUpdateObject(SysRole entity, Integer... menuIds){
        sysRoleService.updateRoleObject(entity, menuIds);
        return new JsonResult("update ok");
    }

    @RequestMapping("/doFindRoles")
    public JsonResult doFindRoles(){
        return new JsonResult("sysRoleService.findRoles()");
    }

}
