package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.Location;
import com.project.dao.LocationMapper;

@Service
public class LocationService {
	@Autowired
	private LocationMapper locationMapper;

	/**
	 * 通过地点 id 获取地点对象
	 * 
	 * @param id
	 * @return
	 */
	public Location getLocationById(Integer locationid) {
		return locationMapper.getLocationById(locationid);
	}

	/**
	 * 通过地点名称获取地点
	 * 
	 * @param locationName
	 * @return
	 */
	public Location getLocationByName(String locationName) {
		return locationMapper.getLocationByName(locationName);
	}

	/**
	 * 添加地点对象, 并返回主键值
	 * 
	 * @param location
	 * @return
	 */
	public int addLocation(Location location) {
		int id = 0;
		locationMapper.addLocation(location);
		id = location.getLocationId();
		return id;
	}

	/**
	 * 通过地点 id 号删除地点
	 * 
	 * @param id
	 */
	public void deleteLocationById(Integer id) {
		locationMapper.deleteLocationById(id);
	}

	/**
	 * 更新地点对象信息
	 * 
	 * @param location
	 */
	public void updateLocation(Location location) {
		locationMapper.updateLocation(location);

	}

	/**
	 * 获取所有地点信息
	 * 
	 * @return
	 */
	public List<Location> getAllLocations() {
		return locationMapper.getAllLocations();
	}

	/**
	 * 通过地点名称模糊查询
	 * 
	 * @param locationName
	 * @return
	 */
	public List<Location> getLocationListForLike(String locationName) {
		return locationMapper.getLocationListForLike(locationName);

	}

}
