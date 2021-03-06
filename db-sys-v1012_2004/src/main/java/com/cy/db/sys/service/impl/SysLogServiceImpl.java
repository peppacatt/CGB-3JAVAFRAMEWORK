package com.cy.db.sys.service.impl;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.exception.ServiceException;
import com.cy.db.sys.dao.SysLogDao;
import com.cy.db.common.po.SysLog;
import com.cy.db.sys.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogDao sysLogDao;

    @Override
    public PageObject<SysLog> findPageObject(String username, Long pageCurrent) {
        long t1 = System.currentTimeMillis();
        if(pageCurrent == null || pageCurrent < 1) throw new IllegalArgumentException("当前页码值无效");
        long rowCount = sysLogDao.findRowCount(username);
        if(rowCount ==0) throw new ServiceException("没有找到对应结果");
        int pageSize = 5;
        long startIndex = (pageCurrent-1)*pageSize;
        List<SysLog> records = sysLogDao.findPageCurrentRecords(username, startIndex, pageSize);
        long t2 = System.currentTimeMillis();
        log.info("time{}",t2-t1);
        return new PageObject<>(pageSize, records, pageCurrent, rowCount);
    }


    @Override
    public int deletePageObjectByIds(Integer... ids) {
        if(ids.length<0 || ids==null) throw new IllegalArgumentException("传入的参数不合法");
        int rows = sysLogDao.deleteObjectByIds(ids);
        if(rows==0) throw new ServiceException("该记录可能已经不存在");
        return rows;
    }
}
