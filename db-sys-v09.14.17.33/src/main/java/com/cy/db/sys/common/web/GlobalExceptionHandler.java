package com.cy.db.sys.common.web;

import com.cy.db.sys.common.pojo.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public JsonResult doHandleRuntimeException(RuntimeException e){
        e.printStackTrace();
        return new JsonResult(e);
    }

}
