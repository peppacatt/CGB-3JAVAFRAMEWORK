package com.cy.db.sys.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysMenu implements Serializable {
    private static final long serialVersionUID = 3497203560771908428L;

    private Integer id;
    private String name;
    private String url;
    private Integer type = 1;
    private Integer sort;
    private String note;
    private Integer parentId;
    private String permission;
    private Date createdTiime;
    private Date modifiedTime;
    private String createdUser;
    private String modifiedUser;

}
