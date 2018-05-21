package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.House;

@Repository
@MapperScan
public interface HouseMapper {

	/**
	 * 通过 id 号获取房屋对象信息
	 * @param id
	 * @return
	 */
	public House getHouseById(Integer houseId);
	
	/**
	 * 通过 house 对象获取 House 信息
	 * @param house
	 * @return
	 */
	public House getHouse(House house);
	
	/**
	 * 添加房屋对象, 并返回主键值
	 * @param house
	 * @return
	 */
	public int addHouse(House house);
	
	/**
	 * 通过房屋 id 号删除房屋对象
	 * @param id
	 */
	public void deleteHouseById(Integer id);
	
	/**
	 * 获取所有房屋信息
	 * @return
	 */
	public List<House> getAllHouses();
	
	/**
	 * 以 house 对象属性作为模糊查询的条件, 查询房屋信息列表
	 * @param house
	 * @return
	 */
	public List<House> getHouseListForLike(House house);
	
}
