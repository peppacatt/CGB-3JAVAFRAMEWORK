package com.cy.db.sys.service;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.po.SysLog;

public interface SysLogService {
    PageObject<SysLog> findPageObject(String username, Long pageCurrent);

    int deletePageObjectByIds(Integer... ids);
}
