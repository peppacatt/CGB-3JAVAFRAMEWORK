package com.cy.db.common.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysUser implements Serializable {

    private static final long serialVersionUID = -8502034569834156715L;
    private Integer id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private String mobile;
    private Byte valid;
    private Integer deptId;
    private Date createdTime;
    private Date modifiedTime;
    private String createdUser;
    private String modifiedUser;

}
