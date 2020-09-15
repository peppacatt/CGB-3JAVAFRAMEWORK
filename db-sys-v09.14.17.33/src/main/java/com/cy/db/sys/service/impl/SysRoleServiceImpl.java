package com.cy.db.sys.service.impl;

import com.cy.db.sys.common.pojo.PageObject;
import com.cy.db.sys.dao.SysRoleDao;
import com.cy.db.sys.pojo.SysRole;
import com.cy.db.sys.pojo.SysRoleMenu;
import com.cy.db.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    @Override
    public List<SysRole> findPageObjects(String name, Long pageCurrent) {
        return null;
    }

    @Override
    public SysRoleMenu findObjectById(Integer id) {
        return null;
    }

    @Override
    public int insertObjects(SysRole entity, Integer[] menuIds) {
        return 0;
    }

    @Override
    public int updateObjects(SysRole entity, Integer[] menuIds) {
        return 0;
    }
}
