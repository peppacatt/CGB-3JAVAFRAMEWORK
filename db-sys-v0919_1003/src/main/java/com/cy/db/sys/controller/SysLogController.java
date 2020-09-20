package com.cy.db.sys.controller;

import com.cy.db.common.vo.JsonResult;
import com.cy.db.sys.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log/")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("doFindPageObjects")
    public JsonResult doFindPageObjects(String username, Long pageCurrent){
        return new JsonResult(sysLogService.retrievePageObjects(username, pageCurrent));
    }

    @RequestMapping("doDeleteObjects")
    public JsonResult doDeleteObjects(Integer... ids){
        sysLogService.deleteObjects(ids);
        return new JsonResult("delete ok");
    }

}
