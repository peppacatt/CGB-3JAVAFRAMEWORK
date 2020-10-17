package com.cy.db.sys.service;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.po.SysUser;
import com.cy.db.common.po.SysUserDept;

import java.util.List;
import java.util.Map;

public interface SysUserService {

    PageObject<SysUserDept> findUserDeptPageObject(String username, Long pageCurrent);

    int updateValidById(Integer id, Byte valid);

    int saveUserRoleObject(SysUser entity, Integer[] roleIds);

    int updateUser(SysUser entity, Integer[] roleIds);

    Map<String, Object> findUserById(Integer id);
}
