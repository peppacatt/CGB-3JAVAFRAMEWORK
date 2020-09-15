package com.cy.db.sys.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class SysRole implements Serializable {

    private static final long serialVersionUID = 312327145128090841L;
    private Long id;
    private String name;
    private String note;
    private Date createdTime;
    private Date modifiedTime;
    private String createdUser;
    private String modifiedUser;

}
