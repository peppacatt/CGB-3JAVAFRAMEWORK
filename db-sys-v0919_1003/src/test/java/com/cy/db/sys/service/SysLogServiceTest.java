package com.cy.db.sys.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SysLogServiceTest {

    @Autowired
    private SysLogService sysLogService;

    @Test
    public void test2(){
        System.out.println(sysLogService.retrievePageObjects("", 2L));
    }

}
