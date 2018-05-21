package com.project.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.beans.User;
import com.project.service.UserService;

public class UserTest {
	
	// 测试合并
	@Autowired
	private UserService userService;
	
	@Before
	public void before() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		userService = (UserService) applicationContext.getBean("userService");
		System.out.println(userService);
	}

	@Test
	public void test() {
		User user = userService.getUserByUserId(1);
		System.out.println(user);
	}
	
	@Test
	public void test2() {
		User user = userService.getUserByUserNameAndPassWord("0620050206", "19810809");
		System.out.println(user);
	}
	

}