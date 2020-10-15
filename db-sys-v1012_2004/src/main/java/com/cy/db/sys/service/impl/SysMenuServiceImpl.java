package com.cy.db.sys.service.impl;

import com.cy.db.common.po.Node;
import com.cy.db.common.exception.ServiceException;
import com.cy.db.common.po.SysMenu;
import com.cy.db.sys.dao.SysMenuDao;
import com.cy.db.sys.dao.SysRoleMenuDao;
import com.cy.db.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuDao sysMenuDao;
    @Autowired
    private SysRoleMenuDao sysRoleMenuDao;

    @Override
    public List<Map<String, Object>> findMenuObject() {
        return sysMenuDao.findMenuObject();
    }

    @Override
    public int deleteCheckedMenuObject(Integer id) {
        if(id==null || id<0) throw new IllegalArgumentException("传入参数不合法");
        if(sysMenuDao.findChildMenuCount(id)>0) throw new ServiceException("请先删除子菜单");
         int row = sysMenuDao.deleteCheckedMenuObject(id);
        sysRoleMenuDao.deleteRoleMenuObjectByMenuId(id);
        if(row==0) throw new ServiceException("该记录可能已经不存在");
        return row;
    }

    @Override
    public List<Node> findZtreeMenuNodes() {
        return sysMenuDao.findZtreeMenuNodes();
    }

    @Override
    public int saveMenuObject(SysMenu entity) {
        if(entity==null) throw new IllegalArgumentException("传入参数不合法");
        if(StringUtils.isEmpty(entity.getName())) throw new IllegalArgumentException("传入参数不合法");
        return sysMenuDao.saveMenuObject(entity);
    }

    @Override
    public int updateMenuObject(SysMenu entity) {
        if(entity==null) throw new IllegalArgumentException("传入的参数不合法");
        if(StringUtils.isEmpty(entity.getName())) throw new IllegalArgumentException("传入的参数不合法");
        return sysMenuDao.updateMenuObject(entity);
    }
}
