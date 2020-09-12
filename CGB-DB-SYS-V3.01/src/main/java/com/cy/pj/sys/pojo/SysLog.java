package com.cy.pj.sys.pojo;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
/**
 * 	基于此对象封装从数据库查询到的日志信息:
 *      类似对象的特性:
 *  1)添加set/get/toString/constructor
 *  2)实现Serializable接口(建议所有用于封装数据的对象都实现此接口)
 *  2.1)序列化:将对象转换为字节便于传输和存储
 *  2.2)反序列化:将网络中的或存储介质中的字节转换为对象
 */
@Data
public class SysLog implements Serializable{//ObjectOutputStream/ObjectInputStream
	private static final long serialVersionUID = -1592163223057343412L;
	private Integer id;
	//用户名
	private String username;
	//用户操作
	private String operation;
	//请求方法
	private String method;
	//请求参数
	private String params;
	//执行时长(毫秒)
	private Long time;
	//IP地址
	private String ip;
	//创建时间
	private Date createdTime;
}
