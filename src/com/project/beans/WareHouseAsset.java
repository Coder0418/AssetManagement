package com.project.beans;

import java.util.Date;
import java.util.List;

/**
 * 仓库表
 * @author yangyang
 *
 */
public class WareHouseAsset {

	private Integer assetItemId;			// 入库资产编号
	private String assetItemName;			// 入库资产名称
	private Integer assetItemNumber;		// 入库资产数量
	private double assetItemEquity;			// 入库资产价值
	private String assetItemSpecification; 	// 入库资产型号规格
	private Date storageTime;				// 入库时间
	private Date purchaseTime;				// 购买时间
	private String assetAgent;				// 资产经办人
	private String reason;					// 入库原因 (新购, 报废...)
	
	// 级联属性
	private AssetCategory assetItemCategory;		// 入库资产类别
	private List<AssetGrant> assetGrantList;		// 资产发放列表
	
	// 查询属性
	private String strStorageTime;
	private String strPurchaseTime;
	
	public WareHouseAsset() {
		super();
	}

	public WareHouseAsset(String assetItemName, Integer assetItemNumber, double assetItemEquity,
			String assetItemSpecification, Date storageTime, Date purchaseTime, String assetAgent, String reason,
			AssetCategory assetItemCategory, List<AssetGrant> assetGrantList, String strStorageTime,
			String strPurchaseTime) {
		super();
		this.assetItemName = assetItemName;
		this.assetItemNumber = assetItemNumber;
		this.assetItemEquity = assetItemEquity;
		this.assetItemSpecification = assetItemSpecification;
		this.storageTime = storageTime;
		this.purchaseTime = purchaseTime;
		this.assetAgent = assetAgent;
		this.reason = reason;
		this.assetItemCategory = assetItemCategory;
		this.assetGrantList = assetGrantList;
		this.strStorageTime = strStorageTime;
		this.strPurchaseTime = strPurchaseTime;
	}

	public Integer getAssetItemId() {
		return assetItemId;
	}

	public void setAssetItemId(Integer assetItemId) {
		this.assetItemId = assetItemId;
	}

	public String getAssetItemName() {
		return assetItemName;
	}

	public void setAssetItemName(String assetItemName) {
		this.assetItemName = assetItemName;
	}

	public Integer getAssetItemNumber() {
		return assetItemNumber;
	}

	public void setAssetItemNumber(Integer assetItemNumber) {
		this.assetItemNumber = assetItemNumber;
	}

	public double getAssetItemEquity() {
		return assetItemEquity;
	}

	public void setAssetItemEquity(double assetItemEquity) {
		this.assetItemEquity = assetItemEquity;
	}

	public String getAssetItemSpecification() {
		return assetItemSpecification;
	}

	public void setAssetItemSpecification(String assetItemSpecification) {
		this.assetItemSpecification = assetItemSpecification;
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

	public String getAssetAgent() {
		return assetAgent;
	}

	public void setAssetAgent(String assetAgent) {
		this.assetAgent = assetAgent;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public AssetCategory getAssetItemCategory() {
		return assetItemCategory;
	}

	public void setAssetItemCategory(AssetCategory assetItemCategory) {
		this.assetItemCategory = assetItemCategory;
	}

	public List<AssetGrant> getAssetGrantList() {
		return assetGrantList;
	}

	public void setAssetGrantList(List<AssetGrant> assetGrantList) {
		this.assetGrantList = assetGrantList;
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

	@Override
	public String toString() {
		return "WareHouseAsset [assetItemId=" + assetItemId + ", assetItemName=" + assetItemName + ", assetItemNumber="
				+ assetItemNumber + ", assetItemEquity=" + assetItemEquity + ", assetItemSpecification="
				+ assetItemSpecification + ", storageTime=" + storageTime + ", purchaseTime=" + purchaseTime
				+ ", assetAgent=" + assetAgent + ", reason=" + reason + ", assetItemCategory=" + assetItemCategory
				+ ", assetGrantList=" + assetGrantList + ", strStorageTime=" + strStorageTime + ", strPurchaseTime="
				+ strPurchaseTime + "]";
	}

}
