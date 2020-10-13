package com.cy.db.sys.service.impl;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.exception.ServiceException;
import com.cy.db.sys.dao.SysLogDao;
import com.cy.db.sys.pojo.po.SysLog;
import com.cy.db.sys.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogDao sysLogDao;

    @Override
    public PageObject<SysLog> findPageObject(String username, Long pageCurrent) {
        if(pageCurrent == null || pageCurrent < 1) throw new IllegalArgumentException("当前页码值无效");
        long rowCount = sysLogDao.findRowCount(username);
        if(rowCount ==0) throw new ServiceException("没有找到对应结果");
        int pageSize = 5;
        long startIndex = (pageCurrent-1)*pageSize;
        List<SysLog> records = sysLogDao.findPageCurrentRecords(username, startIndex, pageSize);
        return new PageObject<>(pageSize, records, pageCurrent, rowCount);
    }
}
