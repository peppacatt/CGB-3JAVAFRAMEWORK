package com.cy.db.sys.service;

import com.cy.db.common.bo.PageObject;
import com.cy.db.sys.pojo.po.SysLog;

public interface SysLogService {
    PageObject<SysLog> findPageObject(String username, Long pageCurrent);
}
