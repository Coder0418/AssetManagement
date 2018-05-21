package com.project.beans;

import java.util.Date;
import java.util.List;

/**
 * 资产项目表
 * @author yang
 *
 */
public class AssetItem {

	private Integer assetId;		// 资产 id 号
	private String usedDepartment;	// 使用单位(部门)
	private String assetName;		// 资产名称
	private Integer assetCount;		// 资产数量
	private Double assetEquity;		// 资产价值
	private Double assetLifeTime;	// 资产年限
	private String assetAgent;		// 资产经办人
	private String assetSpecification;// 资产型号规格
	private Date storageTime;		// 入库时间
	private Date purchaseTime;		// 购买时间
	private String country;			// 资产国别
	private boolean certification;	// 是否体系认证		true:是	false:否
	private String number;			// 凭证号码
	private int status;			// 资产状态 (1:使用中	 0:已报废)
	
	private Department department;			// 使用单位
	private AssetCategory assetCategory;	// 资产类别
	private User user;				// 资产领用人
	private Location assetLocation;		// 资产存放地点
	private List<ExtendInf> extendInf;		// 扩展信息
	
	// 查询条件属性
	private String strStorageTime;
	private String strPurchaseTime;
	private double assetEquityMin;
	private double assetEquityMax;
	
	public AssetItem() {
		super();
	}

	public AssetItem(String usedDepartment, String assetName, Integer assetCount, Double assetEquity,
			Double assetLifeTime, String assetAgent, String assetSpecification, Date storageTime, Date purchaseTime,
			String country, boolean certification, String number, int status, Department department,
			AssetCategory assetCategory, User user, Location assetLocation, List<ExtendInf> extendInf,
			String strStorageTime, String strPurchaseTime, double assetEquityMin, double assetEquityMax) {
		super();
		this.usedDepartment = usedDepartment;
		this.assetName = assetName;
		this.assetCount = assetCount;
		this.assetEquity = assetEquity;
		this.assetLifeTime = assetLifeTime;
		this.assetAgent = assetAgent;
		this.assetSpecification = assetSpecification;
		this.storageTime = storageTime;
		this.purchaseTime = purchaseTime;
		this.country = country;
		this.certification = certification;
		this.number = number;
		this.status = status;
		this.department = department;
		this.assetCategory = assetCategory;
		this.user = user;
		this.assetLocation = assetLocation;
		this.extendInf = extendInf;
		this.strStorageTime = strStorageTime;
		this.strPurchaseTime = strPurchaseTime;
		this.assetEquityMin = assetEquityMin;
		this.assetEquityMax = assetEquityMax;
	}

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public String getUsedDepartment() {
		return usedDepartment;
	}

	public void setUsedDepartment(String usedDepartment) {
		this.usedDepartment = usedDepartment;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public Integer getAssetCount() {
		return assetCount;
	}

	public void setAssetCount(Integer assetCount) {
		this.assetCount = assetCount;
	}

	public Double getAssetEquity() {
		return assetEquity;
	}

	public void setAssetEquity(Double assetEquity) {
		this.assetEquity = assetEquity;
	}

	public Double getAssetLifeTime() {
		return assetLifeTime;
	}

	public void setAssetLifeTime(Double assetLifeTime) {
		this.assetLifeTime = assetLifeTime;
	}

	public String getAssetAgent() {
		return assetAgent;
	}

	public void setAssetAgent(String assetAgent) {
		this.assetAgent = assetAgent;
	}

	public String getAssetSpecification() {
		return assetSpecification;
	}

	public void setAssetSpecification(String assetSpecification) {
		this.assetSpecification = assetSpecification;
	}

	public Date getStorageTime() {
		return storageTime;
	}

	public void setStorageTime(Date storageTime) {
		this.storageTime = storageTime;
	}

	public Date getPurchaseTime() {
		return purchaseTime;
	}

	public void setPurchaseTime(Date purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isCertification() {
		return certification;
	}

	public void setCertification(boolean certification) {
		this.certification = certification;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public AssetCategory getAssetCategory() {
		return assetCategory;
	}

	public void setAssetCategory(AssetCategory assetCategory) {
		this.assetCategory = assetCategory;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Location getAssetLocation() {
		return assetLocation;
	}

	public void setAssetLocation(Location assetLocation) {
		this.assetLocation = assetLocation;
	}

	public List<ExtendInf> getExtendInf() {
		return extendInf;
	}

	public void setExtendInf(List<ExtendInf> extendInf) {
		this.extendInf = extendInf;
	}

	public String getStrStorageTime() {
		return strStorageTime;
	}

	public void setStrStorageTime(String strStorageTime) {
		this.strStorageTime = strStorageTime;
	}

	public String getStrPurchaseTime() {
		return strPurchaseTime;
	}

	public void setStrPurchaseTime(String strPurchaseTime) {
		this.strPurchaseTime = strPurchaseTime;
	}

	public double getAssetEquityMin() {
		return assetEquityMin;
	}

	public void setAssetEquityMin(double assetEquityMin) {
		this.assetEquityMin = assetEquityMin;
	}

	public double getAssetEquityMax() {
		return assetEquityMax;
	}

	public void setAssetEquityMax(double assetEquityMax) {
		this.assetEquityMax = assetEquityMax;
	}

	@Override
	public String toString() {
		return "AssetItem [assetId=" + assetId + ", usedDepartment=" + usedDepartment + ", assetName=" + assetName
				+ ", assetCount=" + assetCount + ", assetEquity=" + assetEquity + ", assetLifeTime=" + assetLifeTime
				+ ", assetAgent=" + assetAgent + ", assetSpecification=" + assetSpecification + ", storageTime="
				+ storageTime + ", purchaseTime=" + purchaseTime + ", country=" + country + ", certification="
				+ certification + ", number=" + number + ", status=" + status + ", department=" + department
				+ ", assetCategory=" + assetCategory + ", user=" + user + ", assetLocation=" + assetLocation
				+ ", extendInf=" + extendInf + ", strStorageTime=" + strStorageTime + ", strPurchaseTime="
				+ strPurchaseTime + ", assetEquityMin=" + assetEquityMin + ", assetEquityMax=" + assetEquityMax + "]";
	}

}
