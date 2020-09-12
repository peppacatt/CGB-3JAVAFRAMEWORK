package com.cy.pj.common.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cy.pj.common.pojo.JsonResult;
/**
 *	 由此注解描述的类为一个控制层全局异常处理类,在此类中可以定义异常处理方法
 *,基于这些异常处理方法对异常进行处理.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	/**
	 * @ExceptionHandler 此注解描述的方法为一个异常处理方法,在注解内部定义的异常
	   *  类型为此方法可以处理的异常类型(包括异常的子类类型).
	 * @param e 用于接收出现的异常
	 * @return
	 */
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public JsonResult doHandleRuntimeException(RuntimeException e) {
		e.printStackTrace();//在后台控制台打印异常.
		return new JsonResult(e);//封装异常信息
	}
	//.....
	//.....
}






