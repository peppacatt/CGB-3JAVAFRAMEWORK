package com.cy.db.sys.service;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.po.SysUser;
import com.cy.db.common.po.SysUserDept;

public interface SysUserService {

    PageObject<SysUserDept> findUserDeptPageObject(String username, Long pageCurrent);

    int updateValidById(Integer id, Byte valid);

    int saveUserRoleObject(SysUser entity, Integer[] roleIds);
}
