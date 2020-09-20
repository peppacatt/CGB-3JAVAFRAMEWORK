package com.cy.db.sys.service.impl;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.exception.ServiceException;
import com.cy.db.sys.dao.SysLogDao;
import com.cy.db.sys.entity.SysLog;
import com.cy.db.sys.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired(required = false)
    private SysLogDao sysLogDao;

    @Override
    public PageObject<SysLog> retrievePageObjects(String username, Long pageCurrent) {
        if(pageCurrent==null || pageCurrent<1) throw new IllegalArgumentException("该页码值无效...");
        long rowCount = sysLogDao.getRowCount(username);
        if(rowCount == 0) throw new ServiceException("该记录可能已经不存在...");
        Integer pageSize = 5;
        long startIndex = (pageCurrent - 1) * pageSize;
        List<SysLog> records = sysLogDao.retrievePageObjects(username, startIndex, pageSize);
        return new PageObject<>(pageSize, records, pageCurrent, rowCount);
    }

    @Override
    public int deleteObjects(Integer... ids) {
        if(ids==null || ids.length==0) throw new IllegalArgumentException("该值无效...");
        int rows = sysLogDao.deleteObjects(ids);
        if(rows==0) throw new ServiceException("该数据可能已经不存在...");
        return rows;
    }
}
