package com.cy.db.sys.service;

import com.cy.db.common.bo.PageObject;
import com.cy.db.sys.entity.SysLog;

public interface SysLogService {

    PageObject<SysLog> retrievePageObjects(String username, Long pageCurrent);

}
