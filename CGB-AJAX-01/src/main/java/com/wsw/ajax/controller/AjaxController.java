package com.wsw.ajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class AjaxController {

	
	private List<String> container = new ArrayList<>();
	
	@RequestMapping("ajaxGet")
	@ResponseBody  //告诉Spring MVC此方法的返回值不是viewname,可以将其看成是普通字符串
	public String ajaxGet() throws Exception{
		Thread.sleep(3000);
		return "Ajax Get Request Result";
	}
	
	
	@RequestMapping("saveName")
	@ResponseBody
	public String saveName(String name) {
		container.add(name);
		return name+"---保存成功";
	}
	
	@RequestMapping("checkName")
	@ResponseBody
	public String checkName(String name) {
		if(container.contains(name))
			return name+"---已存在，请换个名字";
		return name+"可以注册";
	}
	

	
}
