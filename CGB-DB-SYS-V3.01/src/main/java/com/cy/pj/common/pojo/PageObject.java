package com.cy.pj.common.pojo;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
/**基于此对象封装分页信息*/
@Data
@NoArgsConstructor
public class PageObject<T> implements Serializable{
	private static final long serialVersionUID = -7452188623635031202L;
	/**总记录数*/
	private Long rowCount;//池化思想
	/**当前页记录*/
	private List<T> records;
	/**总页数*/
	private Long pageCount;
	/**页面大小(每页最多显示多少条记录)*/
	private Integer pageSize;
	/**当前页码值*/
	private Long pageCurrent;
	
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
//		this.pageCount=rowCount/pageSize;
//		if(rowCount%pageSize!=0)this.pageCount++;
		//计算pageCount的值,方法2
		this.pageCount=(this.rowCount-1)/pageSize+1;
	}
	
	
}
