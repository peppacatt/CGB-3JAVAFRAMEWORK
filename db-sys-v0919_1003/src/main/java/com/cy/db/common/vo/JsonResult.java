package com.cy.db.common.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
public class JsonResult implements Serializable {

    private static final long serialVersionUID = -2513899475947118452L;
    private Integer state = 1;
    private String message = "success";
    private Object data;

    public JsonResult(String message) {
        this.message = message;
    }

    public JsonResult(Object data) {
        this.data = data;
    }

    public JsonResult(Throwable e){
        this.state = 0;
        this.message = e.getMessage();
    }

}
