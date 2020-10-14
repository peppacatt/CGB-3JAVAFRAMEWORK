package com.cy.db.sys.controller;

import com.cy.db.common.vo.JsonResult;
import com.cy.db.sys.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/log")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/doDeleteObjects")
    @ResponseBody
    public JsonResult doDeleteObjects(Integer... ids){
        sysLogService.deletePageObjectByIds(ids);
        return new JsonResult("delete ok");
    }

    @RequestMapping("/doFindPageObjects")
    @ResponseBody
    public JsonResult doFindPageObjects(String username, Long pageCurrent   ){
        return new JsonResult(sysLogService.findPageObject(username, pageCurrent));
    }

}
