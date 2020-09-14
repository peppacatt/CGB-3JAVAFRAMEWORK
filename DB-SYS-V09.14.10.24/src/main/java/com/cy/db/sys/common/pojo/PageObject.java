package com.cy.db.sys.common.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageObject<T> implements Serializable{
	private static final long serialVersionUID = 1029443296184475651L;
	
	private List<T> records;
	private Integer pageSize;
	private Long pageCurrent;
	private Long pageCount;
	private Long rowCount;
	
	public PageObject(Long rowCount, List<T> records, Long pageCount, Integer pageSize, Long pageCurrent) {
	super();
	this.rowCount = rowCount;
	this.records = records;
	this.pageCount = pageCount;
	this.pageSize = pageSize;
	this.pageCurrent = pageCurrent;
}

public PageObject(Long rowCount, List<T> records,Integer pageSize, Long pageCurrent) {
	super();
	this.rowCount = rowCount;
	this.records = records;
	this.pageSize = pageSize;
	this.pageCurrent = pageCurrent;
	//计算pageCount的值,方法1
//	this.pageCount=rowCount/pageSize;
//	if(rowCount%pageSize!=0)this.pageCount++;
	//计算pageCount的值,方法2
	this.pageCount=(this.rowCount-1)/pageSize+1;
}
	
	
}
