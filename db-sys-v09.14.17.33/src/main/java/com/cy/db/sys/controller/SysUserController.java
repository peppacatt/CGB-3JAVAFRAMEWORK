package com.cy.db.sys.controller;

import com.cy.db.sys.common.pojo.JsonResult;
import com.cy.db.sys.pojo.SysUser;
import com.cy.db.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("doFindPageObjects")
    public JsonResult doFindPageObjects(String username, Long pageCurrent){
        return new JsonResult(sysUserService.findPageObjects(username, pageCurrent));
    }

    @RequestMapping("doValidById")
    public JsonResult doValidById(Integer id, byte valid){
        sysUserService.validById(id, valid);
        return new JsonResult("update ok");
    }

    @RequestMapping("doSaveObjects")
    public JsonResult doSaveObjects(SysUser entity, Integer[] roleIds){
        sysUserService.insertObjects(entity, roleIds);
        return new JsonResult("insert ok");
    }

    @RequestMapping("doUpdateObjects")
    public JsonResult doUpdateObjects(SysUser entity, Integer[] roleIds){
        sysUserService.updateObjects(entity, roleIds);
        return new JsonResult("update ok");
    }

    @RequestMapping("doFindObjectById")
    public JsonResult doFindObjectById(Integer id){
        return new JsonResult(sysUserService.findObjectById(id));
    }

}
