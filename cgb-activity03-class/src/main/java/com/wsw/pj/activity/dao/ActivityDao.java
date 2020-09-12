package com.wsw.pj.activity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wsw.pj.activity.pojo.Activity;

@Mapper
public interface ActivityDao {
	
	@Select("SELECT * FROM tb_activity ORDER BY id DESC")
	List<Activity> retrieveActivityAll();
	
	int createActivity(Activity activity);
	
	@Update("UPDATE tb_activity SET state=-1 WHERE id=#{id}")
	int updataState(Integer id);
	
	
}
