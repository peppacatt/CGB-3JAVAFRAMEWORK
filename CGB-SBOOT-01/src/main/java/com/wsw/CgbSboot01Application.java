package com.wsw;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*任何一个项目都有一个启动入口，在springboot中的启动类需要有@SpringBootApplication注解进行描述，并且在类中会定义一个main方法，
 * main方法在运行时会读取配置文件，并加载资源，然后进行初始化操作 
 * 1）SpringBoot项目中的配置文件来源？
 * 		a)SpringBoot官方定义（一般为一些基础配置
 * 		b)第三方定义
 * 		c)我们自己定义
 * 2）SpringBoot项目中的资源加载？（资源可以理解为我们的class文件）
 * 		a)JDK类文件
 * 		b)Spring类文件
 * 		c)自己定义的类文件
 * 3)Spring中的项目资源初始化？
 * 		a)构建实例对象
 * 		b)基于对象存储数据（例如配置信息，默认值）*/

//JVM（了解）
//跟踪类加载:-XX:+TraceClassLoading
//CommandLineRunner此接口定义了一种规范
@SpringBootApplication
public class CgbSboot01Application implements CommandLineRunner{

	public static void main(String[] args) {
		System.out.println("main.args="+Arrays.toString(args));
		SpringApplication.run(CgbSboot01Application.class, args);
	}
	
	@Autowired
	private BeanFactory beanFactory;

	/*在此方法可以获取spring容器中的一些初始化资源	*/
	@Override
	public void run(String...args) throws Exception{
		System.out.println("run.args="+Arrays.toString(args));
		System.out.println("beanFactory="+beanFactory);//DefaultListable
	}

}
