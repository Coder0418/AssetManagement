package com.project.beans;

import java.util.Date;

/**
 * 资产发放申请表
 * @author yangyang
 *
 */
public class AssetGrant {

	private Integer grantId;			// 发放 id
	private Date sumbitTime;			// 申请提交时间
	private String grantStatus;			// 申请状态 (未审批, 已通过)
	
	private User applicationUser; 		// 申请人
	private WareHouseAsset applyAsset;	// 申请仓库资产
	private Location assetLocation;		// 申请存放地点
	
	private String strSumbitTime;

	public AssetGrant() {
		super();
	}

	public AssetGrant(User applicationUser, Date sumbitTime, WareHouseAsset applyAsset, String grantStatus,
			Location assetLocation, String strSumbitTime) {
		super();
		this.applicationUser = applicationUser;
		this.sumbitTime = sumbitTime;
		this.applyAsset = applyAsset;
		this.grantStatus = grantStatus;
		this.assetLocation = assetLocation;
		this.strSumbitTime = strSumbitTime;
	}

	public Integer getGrantId() {
		return grantId;
	}

	public void setGrantId(Integer grantId) {
		this.grantId = grantId;
	}

	public User getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(User applicationUser) {
		this.applicationUser = applicationUser;
	}

	public Date getSumbitTime() {
		return sumbitTime;
	}

	public void setSumbitTime(Date sumbitTime) {
		this.sumbitTime = sumbitTime;
	}

	public WareHouseAsset getApplyAsset() {
		return applyAsset;
	}

	public void setApplyAsset(WareHouseAsset applyAsset) {
		this.applyAsset = applyAsset;
	}

	public String getGrantStatus() {
		return grantStatus;
	}

	public void setGrantStatus(String grantStatus) {
		this.grantStatus = grantStatus;
	}

	public Location getAssetLocation() {
		return assetLocation;
	}

	public void setAssetLocation(Location assetLocation) {
		this.assetLocation = assetLocation;
	}

	public String getStrSumbitTime() {
		return strSumbitTime;
	}

	public void setStrSumbitTime(String strSumbitTime) {
		this.strSumbitTime = strSumbitTime;
	}

	@Override
	public String toString() {
		return "AssetGrant [grantId=" + grantId + ", applicationUser=" + applicationUser + ", sumbitTime=" + sumbitTime
				+ ", applyAsset=" + applyAsset + ", grantStatus=" + grantStatus + ", assetLocation=" + assetLocation
				+ ", strSumbitTime=" + strSumbitTime + "]";
	}		
	
}
