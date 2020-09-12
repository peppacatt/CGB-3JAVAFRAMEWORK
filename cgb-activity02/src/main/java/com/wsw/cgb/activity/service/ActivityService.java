package com.wsw.cgb.activity.service;

import java.util.List;

import com.wsw.cgb.activity.pojo.Activity;

public interface ActivityService {

	List<Activity> retrieveActivityAll();
	
	int createActivity(Activity activity);
	
	int deleteActivityById(Integer id);
	
	Activity retrieveActivityById(Integer id);
	
	int updateActivity(Activity activity);
	
}
