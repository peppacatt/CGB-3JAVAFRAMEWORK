package com.wsw.pj.activity.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


@Data
public class Activity {
	private Integer id;
	private String title;
	private String category;
	
	@DateTimeFormat(pattern="yyyy/MM/dd HH:mm")
	@JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone="GMT+8")
	private Date startTime;
	
	@JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone="GMT+8")
	private Date endTime;
	
	private String remark;
	private Integer state=1;
	
	@JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone="GMT+8")
	private Date createdTime;
	
	private String createdUser;
}
