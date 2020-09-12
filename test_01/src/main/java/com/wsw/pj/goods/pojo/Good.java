package com.wsw.pj.goods.pojo;

import java.util.Date;

public class Good {

	private Integer id;
	private String name;
	private String remark;
	private Date createdTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", remark=" + remark + ", createdTime=" + createdTime + "]";
	}
	
	
	
}
