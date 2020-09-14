package com.cy.db.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.db.sys.common.pojo.JsonResult;
import com.cy.db.sys.common.pojo.PageObject;
import com.cy.db.sys.pojo.SysLog;
import com.cy.db.sys.service.SysLogService;

@Controller
@RequestMapping("/log/")
public class SysLogController {

	@Autowired
	private SysLogService sysLogService; 
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(String username,Long pageCurrent) {
		PageObject<SysLog> PageObject = sysLogService.findPageObjects(username, pageCurrent);
		return new JsonResult(PageObject);
	}
	
	@RequestMapping("doDeleteObjects")
	@ResponseBody
	public JsonResult doDeleteObjects(Integer... ids) {
		sysLogService.deleteObjects(ids);
		return new JsonResult("delete ok");
	}
	
}
