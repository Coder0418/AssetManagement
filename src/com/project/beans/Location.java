package com.project.beans;

/**
 * 地点表
 * 
 * @author yang
 *
 */
public class Location {

	private Integer locationId; // 地点 id
	private String locationName; // 地点名称
	private Integer roomNumber; // 房间数量

	public Location() {
		super();
	}

	public Location(Integer locationId, String locationName, Integer roomNumber) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.roomNumber = roomNumber;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", roomNumber=" + roomNumber
				+ "]";
	}

}
