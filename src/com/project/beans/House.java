package com.project.beans;

import java.util.Date;
import java.util.List;

/**
 * 房屋表
 * @author yang
 *
 */
public class House {
	
	private Integer houseId;		// 房屋 id 号
	private String buildingName;	// 建筑物名称
	private String houseNumber;		// 房屋编码
	private String houseName;		// 房间名称
	private Double houseEquity;		// 房屋净值
	private Double coveredArea;		// 建筑面积
	private Double usableArea;		// 使用面积
	private String responsiblePersonName;	// 责任人名称
	private String buildingStructure;	// 建筑结构
	private Date completionDate;	// 竣工日期
	
	private Department department;	// 房屋使用单位
	private Location location;		// 房屋所在地点
	private Usedtype usedtype;		// 资产使用方向
	private AssetsUsed assetsUsed;	// 资产用途
	private List<AssetItem> assetItems;	// 存放设备
	
	public House() {
		super();
	}

	public House(Integer houseId, String buildingName, String houseNumber, String houseName, Double houseEquity,
			Double coveredArea, Double usableArea, String responsiblePersonName, String buildingStructure,
			Date completionDate, Department department, Location location, Usedtype usedtype, AssetsUsed assetsUsed,
			List<AssetItem> assetItems) {
		super();
		this.houseId = houseId;
		this.buildingName = buildingName;
		this.houseNumber = houseNumber;
		this.houseName = houseName;
		this.houseEquity = houseEquity;
		this.coveredArea = coveredArea;
		this.usableArea = usableArea;
		this.responsiblePersonName = responsiblePersonName;
		this.buildingStructure = buildingStructure;
		this.completionDate = completionDate;
		this.department = department;
		this.location = location;
		this.usedtype = usedtype;
		this.assetsUsed = assetsUsed;
		this.assetItems = assetItems;
	}

	public Integer getHouseId() {
		return houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public Double getHouseEquity() {
		return houseEquity;
	}

	public void setHouseEquity(Double houseEquity) {
		this.houseEquity = houseEquity;
	}

	public Double getCoveredArea() {
		return coveredArea;
	}

	public void setCoveredArea(Double coveredArea) {
		this.coveredArea = coveredArea;
	}

	public Double getUsableArea() {
		return usableArea;
	}

	public void setUsableArea(Double usableArea) {
		this.usableArea = usableArea;
	}

	public String getResponsiblePersonName() {
		return responsiblePersonName;
	}

	public void setResponsiblePersonName(String responsiblePersonName) {
		this.responsiblePersonName = responsiblePersonName;
	}

	public String getBuildingStructure() {
		return buildingStructure;
	}

	public void setBuildingStructure(String buildingStructure) {
		this.buildingStructure = buildingStructure;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Usedtype getUsedtype() {
		return usedtype;
	}

	public void setUsedtype(Usedtype usedtype) {
		this.usedtype = usedtype;
	}

	public AssetsUsed getAssetsUsed() {
		return assetsUsed;
	}

	public void setAssetsUsed(AssetsUsed assetsUsed) {
		this.assetsUsed = assetsUsed;
	}

	public List<AssetItem> getAssetItems() {
		return assetItems;
	}

	public void setAssetItems(List<AssetItem> assetItems) {
		this.assetItems = assetItems;
	}

	@Override
	public String toString() {
		return "House [houseId=" + houseId + ", buildingName=" + buildingName + ", houseNumber=" + houseNumber
				+ ", houseName=" + houseName + ", houseEquity=" + houseEquity + ", coveredArea=" + coveredArea
				+ ", usableArea=" + usableArea + ", responsiblePersonName=" + responsiblePersonName
				+ ", buildingStructure=" + buildingStructure + ", completionDate=" + completionDate + ", department="
				+ department + ", location=" + location + ", usedtype=" + usedtype + ", assetsUsed=" + assetsUsed
				+ ", assetItems=" + assetItems + "]";
	}
	
}
