package com.wsw.pj.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.wsw.pj.common.cache.Cache;

/*@Component  描述类时，用户已告诉spring框架，由spring构建此类型对象
 * 1）Srping框架如何为我们
 * 2）反射构建对象需要用到的API是什么？（Class,Constructor）*/

@Component
public class SearchService {
	
	//@Autowired
	private Cache cache;
	
	public SearchService() {
		System.out.println("SearchService无参构造.....");
	}

	//Autowired  //描述
	public SearchService(@Qualifier("softCache") Cache cache) {
		this.cache = cache;
	}
	
	@Autowired
	public void setCache(Cache cache) {
		this.cache = cache;
	}
	
	public Cache getCache() {
		return cache;
	}
	
}
