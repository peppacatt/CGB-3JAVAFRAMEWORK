package com.cy.pj.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 	基于此Controller处理所有页面请求
 */
@RequestMapping("/")
@Controller
public class PageController {
	
	@RequestMapping("doIndexUI")
	public String doIndexUI() {
		return "starter";//ThymeleafViewResolver
	}
	
	@RequestMapping("doPageUI")
	public String doPageUI() {
		return "common/page";
	}
	
//	@RequestMapping("log/log_list")
//	public String doLogUI() {
//		return "sys/log_list";
//	}
//	
//	@RequestMapping("menu/menu_list")
//	public String doMenuUI() {
//		return "sys/menu_list";
//	}
	
//	@RequestMapping("{module}/{moduleUI}")
//	public String doModuleUI(@PathVariable String moduleUI) {
//		return "sys"+moduleUI;
//	}
	
	@RequestMapping("{module}/{moduleUI}")
	public String doModuleUI(@PathVariable String moduleUI) {
			return "sys/"+moduleUI;
	}
	
	
	
}
