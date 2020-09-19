package com.cy.db.sys.dao;

import com.cy.db.sys.entity.SysLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SysLogDaoTest {

    @Autowired(required = false)
    private SysLogDao sysLogDao;

    @Test
    public void retrievePageObjects(){
        List<SysLog> sysLogs = sysLogDao.retrievePageObjects("", 3L, 3);
        for(SysLog temp: sysLogs){
            System.out.println(temp);
        }
    }

    @Test
    public void getRowCount(){
        long rowCount = sysLogDao.getRowCount("");
        System.out.println("rowCount---"+rowCount);
    }

}
