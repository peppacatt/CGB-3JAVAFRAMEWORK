package com.cy.db.sys.service;

import com.cy.db.sys.pojo.SysRole;
import com.cy.db.sys.pojo.SysRoleMenu;

import java.util.List;

public interface SysRoleService {

    List<SysRole> findPageObjects(String name, Long pageCurrent);

    SysRoleMenu findObjectById(Integer id);

    int insertObjects(SysRole entity, Integer[] menuIds);

    int updateObjects(SysRole entity, Integer[] menuIds);

}
