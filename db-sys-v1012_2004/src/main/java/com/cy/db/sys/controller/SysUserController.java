package com.cy.db.sys.controller;

import com.cy.db.common.po.SysUser;
import com.cy.db.common.vo.JsonResult;
import com.cy.db.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/doFindPageObjects")
    public JsonResult doFindPageObjects(String username, Long pageCurrent){
        return new JsonResult(sysUserService.findUserDeptPageObject(username, pageCurrent));
    }

    @RequestMapping("/doValidById")
    public JsonResult doValidById(Integer id, Byte valid){
        sysUserService.updateValidById(id, valid);
        return new JsonResult("update ok");
    }

    @RequestMapping("/doSaveObject")
    public JsonResult doSaveObject(SysUser entity, Integer... roleIds){
        sysUserService.saveUserRoleObject(entity, roleIds);
        return new JsonResult("save ok");
    }

}
