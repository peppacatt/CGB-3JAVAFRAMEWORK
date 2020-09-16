package com.cy.db.sys.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysUserDept implements Serializable {

    private static final long serialVersionUID = -3619106868276632638L;
    private Integer id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private String mobile;
    private Byte valid = 1;
    private SysDept sysDept;
    private Date createdTime;
    private Date modifiedTime;
    private String createdUser;
    private String modifiedUser;

}
