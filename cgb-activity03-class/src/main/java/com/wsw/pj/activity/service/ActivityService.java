package com.wsw.pj.activity.service;

import java.util.List;

import com.wsw.pj.activity.pojo.Activity;

public interface ActivityService {
	List<Activity> retrieveActivityAll();
	
	int createActivity(Activity activity);
}
