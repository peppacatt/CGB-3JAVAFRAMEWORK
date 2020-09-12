package com.wsw.pj.activity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wsw.pj.activity.pojo.Activity;
import com.wsw.pj.activity.service.ActivityService;

@Controller
@RequestMapping("/activity/")
public class ActivityController {

	@Autowired
	private ActivityService activityService;
	
	@RequestMapping("retrieveActivityAllUI")
	public String retrieveActivityAllUI() {
		return "activity-home";
	}
	
	@RequestMapping("retrieveActivityAllData")
	@ResponseBody
	public List<Activity> retrieveActivityAllData(){
		return activityService.retrieveActivityAll();
	}
	
	@RequestMapping("createActivity")
	@ResponseBody
	public String createActivity(Activity activity) {
		activityService.createActivity(activity);
		return "save ok";
	}
	
}
