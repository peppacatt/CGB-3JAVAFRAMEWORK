package com.cy.db.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.db.sys.common.exception.ServiceException;
import com.cy.db.sys.common.pojo.PageObject;
import com.cy.db.sys.dao.SysLogDao;
import com.cy.db.sys.pojo.SysLog;
import com.cy.db.sys.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {
	
	@Autowired
	private SysLogDao sysLogDao;

	@Override
	public PageObject<SysLog> findPageObjects(String username, Long pageCurrent) {
		if(pageCurrent==null||pageCurrent<1)throw new IllegalArgumentException("当前页码值无效...");
		Integer pageSize = 5;
		Long startIndex = (pageCurrent-1)*pageSize;
		List<SysLog> records = sysLogDao.findPageObjects(username, startIndex, pageSize);
		Long rowCount = sysLogDao.getRowCount(username);
		if(rowCount==0)throw new ServiceException("没有找到对应结果...");
		return new PageObject<>(rowCount, records, pageSize, rowCount);
	}
	

	@Override
	public int deleteObjects(Integer... ids) {
		if(ids==null||ids.length==0)throw new IllegalArgumentException("请输入id值...");
		int deleteObjects = sysLogDao.deleteObjects(ids);
		if(deleteObjects==0)throw new ServiceException("记录可能已经不存在...");
		return deleteObjects;
	}

}
