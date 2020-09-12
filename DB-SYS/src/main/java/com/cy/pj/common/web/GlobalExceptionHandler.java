package com.cy.pj.common.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.common.pojo.JsonResult;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public JsonResult doHandleRuntimeException(RuntimeException e) {
		e.printStackTrace();
		return new JsonResult();
	}
	
}
