package com.project.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.beans.House;
import com.project.service.HouseService;

public class HouseTest {
	
	@Autowired
	private HouseService houseService;
	
	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		houseService = (HouseService)applicationContext.getBean("houseService");
		System.out.println(houseService);
	}
	
	@Test
	public void test() {
		House house = houseService.getHouseById(1);
		System.out.println(house);
	}
	
	@Test
	public void testGetAllHouse() {
		List<House> houseList = houseService.getAllHouses();
		System.out.println(houseList);
	}
	
}
