package com.cy.db.sys.service;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.po.CheckBox;
import com.cy.db.common.po.SysRole;
import com.cy.db.common.po.SysRoleMenu;

import java.util.List;

public interface SysRoleService {

    PageObject<SysRole> findPageObject(String name, Long pageCurrent);

    int saveRoleObject(SysRole entity, Integer... menuIds);

    SysRoleMenu findRoleMenuObject(Integer id);

    int updateRoleObject(SysRole entity, Integer[] menuIds);

    List<CheckBox> findRoles();
}
