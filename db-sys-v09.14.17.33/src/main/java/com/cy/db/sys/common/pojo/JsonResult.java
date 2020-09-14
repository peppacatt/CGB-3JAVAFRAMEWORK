package com.cy.db.sys.common.pojo;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JsonResult implements Serializable{
	private static final long serialVersionUID = -7923194968843055354L;
	
	private Integer state = 1;
	private String message = "success";
	private Object data;
	
	public JsonResult(String message) {
		this.message = message;
	}
	
	public JsonResult(Object data) {
		this.data = data;
	}
	
	public JsonResult(Throwable e) {
		this.state = 0;
		this.message = e.getMessage();
	}
	
}
