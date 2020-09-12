package com.cy.pj.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.common.pojo.PageObject;
import com.cy.pj.sys.dao.SysLogDao;
import com.cy.pj.sys.pojo.SysLog;
import com.cy.pj.sys.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {
	@Autowired
	private SysLogDao sysLogDao;
	
	@Override
	public PageObject<SysLog> findPageObjects(String username, Long pageCurrent) {
		//验证参数的有效性
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码值无效");//e.message="当前页码值无效"
		//统计总记录数并进行校验
		long rowCount=sysLogDao.getRowCount(username);
		if(rowCount==0)
			throw new ServiceException("没有找到对应结果");
		//查询当前页数据
		int  pageSize=5;//(这个值也可以从页面传递到服务端)
		long startIndex=(pageCurrent-1)*pageSize;
		List<SysLog> records=sysLogDao.findPageObjects(username, startIndex, pageSize);
		//封装查询以及计算结果
//		PageObject<SysLog> po=new PageObject<>();
//		po.setRowCount(rowCount);
//		po.setRecords(records);
//		po.setPageSize(pageSize);
//		po.setPageCurrent(pageCurrent);
//		long pageCount=rowCount/pageSize;
//		if(rowCount%pageSize!=0)pageCount++;
//		po.setPageCount(pageCount);
//		return po;
		//return new PageObject<>(rowCount, records, pageCount, pageSize, pageCurrent);
		return new PageObject<>(rowCount, records,pageSize, pageCurrent);
	}
	
	
	
}
