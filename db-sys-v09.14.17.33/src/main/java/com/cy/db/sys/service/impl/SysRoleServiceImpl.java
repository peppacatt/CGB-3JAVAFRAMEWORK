package com.cy.db.sys.service.impl;

import com.cy.db.sys.common.exception.ServiceException;
import com.cy.db.sys.common.pojo.CheckBox;
import com.cy.db.sys.common.pojo.PageObject;
import com.cy.db.sys.dao.SysRoleDao;
import com.cy.db.sys.dao.SysRoleMenuDao;
import com.cy.db.sys.pojo.SysRole;
import com.cy.db.sys.pojo.SysRoleMenu;
import com.cy.db.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;


@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired(required = false)
    private SysRoleDao sysRoleDao;

    @Autowired(required = false)
    private SysRoleMenuDao sysRoleMenuDao;

    @Override
    public PageObject<SysRole> findPageObjects(String name, Long pageCurrent) {
        if(pageCurrent==null || pageCurrent<1) throw new IllegalArgumentException("该页码值无效...");
        Integer pageSize = 2;
        long startIndex = (pageCurrent - 1) * pageSize;
        List<SysRole> records = sysRoleDao.findPageObjects(name, startIndex, pageSize);
        long rowCount = sysRoleDao.getRowCount(name);
        if(rowCount==0) throw new ServiceException("没有找到对应的记录...");
        return new PageObject<>(rowCount, records, pageSize, pageCurrent);
    }

    @Override
    public List<CheckBox> findRoles() {
        return sysRoleDao.findRoles();
    }

    @Override
    public SysRoleMenu findObjectById(Integer id) {
        if(id==null || id<1) throw new IllegalArgumentException("该id值无效...");
        return sysRoleDao.findObjectById(id);
    }

    @Override
    public int insertObjects(SysRole entity, Integer[] menuIds) {
        if(entity==null) throw new IllegalArgumentException("对象不能为空");
        if(StringUtils.isEmpty(entity.getName())) throw new IllegalArgumentException("角色名不能为空...");
        if(menuIds==null || menuIds.length==0) throw new IllegalArgumentException("请为角色分配权限");
        int insertObjects = sysRoleDao.insertObjects(entity);
        sysRoleMenuDao.insertObjects(entity.getId(), menuIds);
        return insertObjects;
    }

    @Override
    public int updateObjects(SysRole entity, Integer[] menuIds) {
        if(entity==null) throw new IllegalArgumentException("对象不能为空...");
        if(StringUtils.isEmpty(entity.getName())) throw new IllegalArgumentException("角色名不能为空...");
        if(menuIds==null || menuIds.length==0) throw new IllegalArgumentException("为角色分配权限...");
        int updateObject = sysRoleDao.updateObject(entity);
        sysRoleMenuDao.deleteObjectsByRoleId(entity.getId());
        sysRoleMenuDao.insertObjects(entity.getId(), menuIds);
        return updateObject;
    }
}
