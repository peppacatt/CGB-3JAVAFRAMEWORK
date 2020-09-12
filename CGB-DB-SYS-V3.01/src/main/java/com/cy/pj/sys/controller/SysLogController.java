package com.cy.pj.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.sys.service.SysLogService;
import com.cy.pj.sys.pojo.SysLog;
import com.cy.pj.common.pojo.JsonResult;
import com.cy.pj.common.pojo.PageObject;
@Controller
@RequestMapping("/log/")
public class SysLogController {
	
	@Autowired
	private SysLogService sysLogService;
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(String username,Long pageCurrent) {
//		try {
			PageObject<SysLog> pageObject=
					sysLogService.findPageObjects(username, pageCurrent);
			return new JsonResult(pageObject);
//		}catch(Throwable e) {
//			return new JsonResult(e);
//		}
	}
	//思考:假如控制层有多个方法,每个方法都要进行try操作,其实也是一个重复的劳动.

}





