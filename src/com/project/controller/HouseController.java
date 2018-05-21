package com.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.beans.House;
import com.project.service.HouseService;

@Controller
public class HouseController {

	@Autowired
	private HouseService houseService;

	// 跳转房屋查询页面
	@RequestMapping("/houseQuery")
	public String houseQuery(Map<String, Object> map) {
		List<House> houseList = houseService.getAllHouses();

		map.put("houseList", houseList);

		return "assets-houseQuery";
	}

}
