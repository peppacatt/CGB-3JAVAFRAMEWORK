package com.wsw.cgb.activity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsw.cgb.activity.dao.ActivityDao;
import com.wsw.cgb.activity.pojo.Activity;
import com.wsw.cgb.activity.service.ActivityService;


@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityDao activityDao;
	
	@Override
	public List<Activity> retrieveActivityAll() {
		return activityDao.retrieveActivityAll() ;
	}
	
	@Override
	public int createActivity(Activity activity) {
		return activityDao.createActivity(activity);
	}
	
	@Override
	public int deleteActivityById(Integer id) {
		return activityDao.deleteActivityById(id);
	}
	
	@Override
	public Activity retrieveActivityById(Integer id) {
		return activityDao.retrieveActivityById(id);
	}
	
	@Override
	public int updateActivity(Activity activity) {
		return activityDao.updateActivity(activity);
	}

}
