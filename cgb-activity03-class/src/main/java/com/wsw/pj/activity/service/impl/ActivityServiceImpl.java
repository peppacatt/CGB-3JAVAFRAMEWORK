package com.wsw.pj.activity.service.impl;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsw.pj.activity.dao.ActivityDao;
import com.wsw.pj.activity.pojo.Activity;
import com.wsw.pj.activity.service.ActivityService;


@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityDao activityDao;
	
	
	@Override
	public List<Activity> retrieveActivityAll() {
		return activityDao.retrieveActivityAll();
	}
	
	
	@Override
	public int createActivity(Activity activity) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("开始执行修改活动状态的操作...");
				activityDao.updataState(activity.getId());
				timer.cancel();
			}
		}, activity.getEndTime());
		return activityDao.createActivity(activity);
	}

}
