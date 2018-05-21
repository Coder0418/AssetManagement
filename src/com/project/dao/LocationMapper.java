package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.Location;

@Repository
@MapperScan
public interface LocationMapper {
	
	/**
	 * 通过地点 id 获取地点对象
	 * @param id
	 * @return
	 */
	public Location getLocationById(Integer locationid);
	
	/**
	 * 通过地点名称获取地点
	 * @param locationName
	 * @return
	 */
	public Location getLocationByName(String locationName);
	
	/**
	 * 添加地点对象, 并返回主键值
	 * @param location
	 * @return
	 */
	public int addLocation(Location location);
	
	/**
	 * 通过地点 id 号删除地点
	 * @param id
	 */
	public void deleteLocationById(Integer id);
	
	/**
	 * 更新地点对象信息
	 * @param location
	 */
	public void updateLocation(Location location);
	
	/**
	 * 获取所有地点信息
	 * @return
	 */
	public List<Location> getAllLocations();
	
	/**
	 * 通过地点名称模糊查询
	 * @param locationName
	 * @return
	 */
	public List<Location> getLocationListForLike(String locationName);
	
}
