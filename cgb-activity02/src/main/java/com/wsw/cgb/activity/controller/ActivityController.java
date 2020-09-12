package com.wsw.cgb.activity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wsw.cgb.activity.pojo.Activity;
import com.wsw.cgb.activity.service.ActivityService;

@Controller
@RequestMapping("/activity/")
public class ActivityController {
	
	@Autowired
	private ActivityService activityService;
	
	@RequestMapping("activityHome")
	public String activityHome(Model model) {
		List<Activity> activitiesAll = activityService.retrieveActivityAll();
		model.addAttribute("activities",activitiesAll);
		return "activity-home";
	}
	
	@RequestMapping("createActivity")
	public String createActivity() {
		return "activity-add";
	}
	
	@RequestMapping("submitCreateActivity")
	public String submitCreateActivity(Activity activity) {
		activityService.createActivity(activity);
		return "redirect:/activity/activityHome";
	}
	
	@RequestMapping("deleteActivityById/{id}")
	public String deleteActivityById(@PathVariable Integer id) {
		activityService.deleteActivityById(id);
		return "redirect:/activity/activityHome";
	}
	
	@RequestMapping("updateActivityById/{id}")
	public String updateActivityById(@PathVariable Integer id,Model model) {
		Activity activity = activityService.retrieveActivityById(id);
		model.addAttribute("activity",activity);
		return "activity-update";
	}
	
	@RequestMapping("submitUpdateActivity")
	public String submitUpdateActivity(Activity activity) {
		activityService.updateActivity(activity);
		return "redirect:/activity/activityHome";
	}
	
	
}
