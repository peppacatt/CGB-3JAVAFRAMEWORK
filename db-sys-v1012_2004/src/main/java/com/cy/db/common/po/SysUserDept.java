package com.cy.db.common.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysUserDept implements Serializable {

    private static final long serialVersionUID = -3717511282251555807L;
    private Integer id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private String mobile;
    private Byte valid;
    private SysDept sysDept; //
    private Date createdTime;
    private Date modifiedTime;
    private String createdUser;
    private String modifiedUser;

}
