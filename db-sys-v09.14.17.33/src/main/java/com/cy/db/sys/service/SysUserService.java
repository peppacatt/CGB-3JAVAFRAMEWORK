package com.cy.db.sys.service;

import com.cy.db.sys.common.pojo.PageObject;
import com.cy.db.sys.pojo.SysUser;
import com.cy.db.sys.pojo.SysUserDept;

import java.util.List;
import java.util.Map;

public interface SysUserService {

    PageObject<SysUserDept> findPageObjects(String username, Long pageCurrent);

    int validById(Integer id, Byte valid);

    int insertObjects(SysUser entity, Integer[] roleIds);

    int updateObjects(SysUser entity, Integer[] roleIds);

    Map<String, Object> findObjectById(Integer id);

}
