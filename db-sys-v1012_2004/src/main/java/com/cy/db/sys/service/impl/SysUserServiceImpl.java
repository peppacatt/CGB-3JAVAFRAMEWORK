package com.cy.db.sys.service.impl;

import com.cy.db.common.bo.PageObject;
import com.cy.db.common.exception.ServiceException;
import com.cy.db.common.po.SysUser;
import com.cy.db.common.po.SysUserDept;
import com.cy.db.sys.dao.SysUserDao;
import com.cy.db.sys.dao.SysUserRoleDao;
import com.cy.db.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.UUID;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private SysUserRoleDao sysUserRoleDao;

    @Override
    public PageObject<SysUserDept> findUserDeptPageObject(String username, Long pageCurrent) {
        if(pageCurrent==null||pageCurrent<1) throw new IllegalArgumentException("页码值不合法");
        long rowCount = sysUserDao.findRowCount(username);
        if(rowCount==0) throw new ServiceException("记录可能已经不存在");
        int pageSize = 5;
        long startIndex = (pageCurrent-1)*pageSize;
        List<SysUserDept> records =  sysUserDao.findUserDeptRecords(username, startIndex, pageSize);
        return new PageObject<>(pageSize, records, pageCurrent, rowCount);
    }

    @Override
    public int updateValidById(Integer id, Byte valid) {
        if(id==null||id<1) throw new IllegalArgumentException("参数不合法");
        if(valid!=0&&valid!=1) throw new IllegalArgumentException("参数不合法");
        int row = sysUserDao.updateValidById(id, valid, "admin");
        if(row==0) throw new ServiceException("记录可能已经不存在");
        return row;
    }

    @Override
    public int saveUserRoleObject(SysUser entity, Integer[] roleIds) {
        if(entity==null) throw new IllegalArgumentException("传入对象不能为空");
        if(roleIds==null||roleIds.length==0) throw new IllegalArgumentException("必须为用户分配角色");
        if(entity.getUsername()==null||"".equals(entity.getUsername())) throw new IllegalArgumentException("用户名不能为空");
        if(entity.getPassword()==null||"".equals(entity.getPassword())) throw new IllegalArgumentException("密码不能为空");
        String salt = UUID.randomUUID().toString();
        String hashedPassword = DigestUtils.md5DigestAsHex((salt + entity.getPassword()).getBytes());
        entity.setSalt(salt);
        entity.setPassword(hashedPassword);
        int row = sysUserDao.saveUserObject(entity);
        if(row==0) throw new ServiceException("记录可能已经不存在");
        sysUserRoleDao.saveUserRoleObjectByUserId(entity.getId(), roleIds);
        return row;
    }
}
