package com.project.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.service.ExtendInfService;

public class ExtendInfTest {
	
	@Autowired
	private ExtendInfService extendInfService;
	
	
	@Before
	public void before() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		extendInfService = (ExtendInfService)applicationContext.getBean("extendInfService");
	}

	@Test
	public void test() {
		System.out.println(extendInfService.getExtendInfById(1));
	}

}
