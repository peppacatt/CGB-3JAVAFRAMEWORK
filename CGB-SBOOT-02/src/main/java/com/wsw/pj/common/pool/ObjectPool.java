package com.wsw.pj.common.pool;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype") //每次从spring容器获取对象都会创建一个新的对象
//@Scope("singleton")  //默认就是单例作用域（这个类的实例在一个spring容器中默认只有一个对象）

@Lazy  //默认是true   词注解用于告诉spring框架，它描述的类的实例，假如暂时用不到，就不要先创建
//@Lazy(true)
//@Lazy(value=true)

@Component
public class ObjectPool {
	public ObjectPool() {
		System.out.println("ObjectPool()构造方法执行了....");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init()执行了...");
	}
	
	@PreDestroy
	public void close() {
		System.out.println("close()执行了...");
	}
	
}
