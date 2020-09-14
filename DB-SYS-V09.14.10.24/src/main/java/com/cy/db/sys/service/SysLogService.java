package com.cy.db.sys.service;

import com.cy.db.sys.common.pojo.PageObject;
import com.cy.db.sys.pojo.SysLog;

public interface SysLogService {

	PageObject<SysLog> findPageObjects(String username,Long pageCurrent);
	
	int deleteObjects(Integer... ids);
	
}
