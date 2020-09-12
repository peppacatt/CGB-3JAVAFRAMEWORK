package com.wsw.cgb.activity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wsw.cgb.activity.pojo.Activity;

@Mapper
public interface ActivityDao {

	@Select("SELECT * FROM tb_activity")
	List<Activity> retrieveActivityAll();

	@Insert("INSERT INTO tb_activity VALUE(null,#{title},#{category},now(),now(),#{remark},#{state},now(),#{createdUser})")
	int createActivity(Activity activity);
	
	@Delete("DELETE FROM tb_activity WHERE id=#{id}")
	int deleteActivityById(Integer id);
	
	@Select("SELECT * FROM tb_activity WHERE id=#{id}")
	Activity retrieveActivityById(Integer id);
	
	@Update("UPDATE tb_activity SET title=#{title},category=#{category},remark=#{remark},state=#{state},createdUser=#{createdUser} WHERE id=#{id}")
	int updateActivityById(Activity activity);
	
}
