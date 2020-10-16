package com.cy.db.sys.service.impl;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.exception.ServiceException;
import com.cy.db.common.po.SysRole;
import com.cy.db.common.po.SysRoleMenu;
import com.cy.db.sys.dao.SysRoleDao;
import com.cy.db.sys.dao.SysRoleMenuDao;
import com.cy.db.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    @Autowired
    private SysRoleMenuDao sysRoleMenuDao;

    @Override
    public PageObject<SysRole> findPageObject(String name, Long pageCurrent) {
        if(pageCurrent==null || pageCurrent<1) throw new IllegalArgumentException("该页码值不合法");
        Long rowCount = sysRoleDao.findRowCount(name);
        if(rowCount==0) throw new ServiceException("记录不存在");
        int pageSize = 5;
        long startIndex = (pageCurrent-1)*pageSize;
        List<SysRole> records = sysRoleDao.findPageCurrentRecords(name, startIndex, pageSize);
        return new PageObject<>(pageSize, records, pageCurrent, rowCount);
    }

    @Override
    public int saveRoleObject(SysRole entity, Integer... menuIds) {
        if(entity==null) throw new IllegalArgumentException("传入的对象不能为空");
        if(StringUtils.isEmpty(entity.getName())) throw new IllegalArgumentException("角色名不能为空");
        if(menuIds==null || menuIds.length==0) throw new IllegalArgumentException("必须为角色分配权限");
        int rows = sysRoleDao.saveRoleObject(entity);
        sysRoleMenuDao.saveRoleMenuByRoleId(entity.getId(), menuIds);
        return rows;
    }

    @Override
    public SysRoleMenu findRoleMenuObject(Integer id) {
        if(id==null||id<1) throw new IllegalArgumentException("传入的参数不合法");
        return sysRoleDao.findRoleMenuObject(id);
    }

    @Override
    public int updateRoleObject(SysRole entity, Integer[] menuIds) {
        if(entity==null) throw new IllegalArgumentException("传入的对象不能为空");
        if(StringUtils.isEmpty(entity.getName())) throw new IllegalArgumentException("角色名不能为空");
        if(menuIds==null || menuIds.length==0) throw new IllegalArgumentException("必须为角色分配权限");
        int rows = sysRoleDao.updateRoleObject(entity);
        sysRoleMenuDao.deleteRoleMenuObjectByRoleId(entity.getId());
        sysRoleMenuDao.saveRoleMenuByRoleId(entity.getId(), menuIds);
        return rows;
    }
}
