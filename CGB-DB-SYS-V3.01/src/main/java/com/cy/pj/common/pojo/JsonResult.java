package com.cy.pj.common.pojo;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
借助此对象封装控制层响应到客户端的数据,在这个对象中会为数据添加一个状态.
 */
@Data
@NoArgsConstructor
public class JsonResult implements Serializable{
   private static final long serialVersionUID = 5110901796917551720L;
   /**状态码:信息标识*/
   private Integer state=1;//1表示success,0表示error
   /**状态码对应的信息*/
   private String  message="success";
   /**业务层响应给控制层的数据*/
   private Object  data;
   
   public JsonResult(String message) {
	   this.message=message;
   }
   public JsonResult(Object  data) {
	   this.data=data;
   }
   public JsonResult(Throwable e) {
	   this.state=0;
	   this.message=e.getMessage();//获取异常对象中的异常信息
   }
    
}
