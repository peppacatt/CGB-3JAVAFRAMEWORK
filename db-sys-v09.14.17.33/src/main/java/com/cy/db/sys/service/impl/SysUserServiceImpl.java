package com.cy.db.sys.service.impl;

import com.cy.db.sys.common.exception.ServiceException;
import com.cy.db.sys.common.pojo.PageObject;
import com.cy.db.sys.common.utils.AssertUtils;
import com.cy.db.sys.dao.SysUserDao;
import com.cy.db.sys.dao.SysUserRoleDao;
import com.cy.db.sys.pojo.SysUser;
import com.cy.db.sys.pojo.SysUserDept;
import com.cy.db.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired(required = false)
    private SysUserDao sysUserDao;

    @Autowired(required = false)
    private SysUserRoleDao sysUserRoleDao;

    @Override
    public PageObject<SysUserDept> findPageObjects(String username, Long pageCurrent) {
        if(pageCurrent==null || pageCurrent<1) throw new IllegalArgumentException("该页码值无效...");
        Integer pageSize = 2;
        long startIndex = (pageCurrent - 1) * pageSize;
        List<SysUserDept> records = sysUserDao.findPageObjects(username, startIndex, pageSize);
        long rowCount = sysUserDao.getRowCount(username);
        if(rowCount==0) throw new ServiceException("数据可能已经不存在...");
        return new PageObject<>(rowCount, records, pageSize, pageCurrent);
    }

    @Override
    public int validById(Integer id, Byte valid) {
        AssertUtils.isArgValid(id==null || id<0, "参数值无效...");
        AssertUtils.isArgValid(valid!=0 && valid!=1, "状态值无效...");
        int rows = sysUserDao.validById(id, valid, "admin");
        AssertUtils.isServiceValid(rows==0, "记录可能已经不存在...");
        return rows;
    }

    @Override
    public int insertObjects(SysUser entity, Integer[] roleIds) {
        AssertUtils.isArgValid(entity==null, "对象不能为空...");
        AssertUtils.isArgValid(entity.getUsername()==null || "".equals(entity.getUsername()), "用户名不能为空...");
        AssertUtils.isArgValid(entity.getPassword()==null || "".equals(entity.getPassword()), "密码不能为空...");
        AssertUtils.isArgValid(roleIds==null || roleIds.length==0, "必须为用户分配角色...");
        int rows = sysUserDao.insertObjects(entity);
        sysUserRoleDao.insertObjects(entity.getId(), roleIds);
        return rows;
    }

    @Override
    public int updateObjects(SysUser entity, Integer[] roleIds) {
        return 0;
    }

    @Override
    public Map<String, Object> findObjectById(Integer id) {
        return null;
    }
}
