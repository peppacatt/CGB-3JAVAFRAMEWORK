package com.cy.db.sys.service.impl;

import com.cy.db.sys.common.exception.ServiceException;
import com.cy.db.sys.common.pojo.Node;
import com.cy.db.sys.dao.SysMenuDao;
import com.cy.db.sys.dao.SysRoleMenuDao;
import com.cy.db.sys.pojo.SysMenu;
import com.cy.db.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired(required = false)
    private SysMenuDao sysMenuDao;

    @Autowired(required = false)
    private SysRoleMenuDao sysRoleMenuDao;

    @Override
    public List<Map<String, Object>> findObjects() {
        return sysMenuDao.findObjects();
    }

    @Override
    public int deleteObjects(Integer id) {
        if (id == null || id < 1) throw new IllegalArgumentException("id值无效...");
        int childCount = sysMenuDao.getChildCount(id);
        if (childCount > 0) throw new ServiceException("请先删除子菜单...");
        sysRoleMenuDao.deleteObjectsByMenuId(id);
        int rows = sysMenuDao.deleteObjects(id);
        if (rows == 0) throw new ServiceException("数据可能已经不存在...");
        return rows;
    }

    @Override
    public List<Node> findZtreeMenuNodes() {
        return sysMenuDao.findZtreeMenuNodes();
    }

    @Override
    public int inserObjects(SysMenu entity) {
        if (entity == null) throw new IllegalArgumentException("新增对象不能为空...");
        if (StringUtils.isEmpty(entity.getName())) throw new IllegalArgumentException("菜单名不能为空...");
        int rows = sysMenuDao.insertObjects(entity);
        return rows;
    }

    @Override
    public int updateObjects(SysMenu entity) {
        if (entity == null) throw new IllegalArgumentException("对象不能为空...");
        if (StringUtils.isEmpty(entity.getName())) throw new IllegalArgumentException("菜单名不能为空...");
        int rows = sysMenuDao.updateObjects(entity);
        if (rows == 0) throw new ServiceException("数据可能已经不存在...");
        return rows;
    }
}
