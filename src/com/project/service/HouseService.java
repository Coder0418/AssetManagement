package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.House;
import com.project.dao.HouseMapper;

@Service
public class HouseService {
	@Autowired
	private HouseMapper houseMapper;
	
	//通过 id 号获取房屋对象信息
	public House getHouseById(Integer houseId) {
		return houseMapper.getHouseById(houseId);
	}
	
	//添加房屋对象, 并返回主键值
	public int addHouse(House house) {
		return houseMapper.addHouse(house);
	}
	
	//通过房屋 id 号删除房屋对象
	public void deleteHouseById(Integer id) {
		 houseMapper.deleteHouseById(id);
	}
	
	//获取所有房屋信息
	public List<House> getAllHouses(){
		return houseMapper.getAllHouses();
	}
	
	//以 house 对象属性作为模糊查询的条件, 查询房屋信息列表
	public List<House> getHouseListForLike(House house){
		return houseMapper.getHouseListForLike(house);
	}
}
