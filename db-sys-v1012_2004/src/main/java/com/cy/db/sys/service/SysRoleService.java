package com.cy.db.sys.service;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.po.SysRole;

public interface SysRoleService {
    PageObject<SysRole> findPageObject(String name, Long pageCurrent);

    int saveRoleObject(SysRole entity, Integer... menuIds);
}
