package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.atguigu.pojo.Person;

public class springTest {
	@Test
	public void test1() throws Exception {
		//使用Spring 一定要先创建Spring的IOC容器
		//在Spring中 有一个接口 表示Spring IOC容器ApplicationContext接口
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Person person = (Person)applicationContext.getBean("p1");
//		System.out.println(person);
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("config/applicationContext.xml");
		Person person = (Person)applicationContext.getBean(Person.class);
		System.out.println(person);
		
	} 
}
