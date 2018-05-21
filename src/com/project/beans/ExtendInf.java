package com.project.beans;

import java.io.File;
import java.util.Date;

/**
 * 资产扩展信息表
 * 
 * @author yang
 *
 */
public class ExtendInf {

	private Integer extendId; // 扩展 id 号
	private String alterProgress; // 设备修改进度
	private String alterReason; // 修改原因
	private String alterAgentName; // 修改后领用人名称
	private String alterSubmitUserName; // 修改提交人
	private Integer newLocationId;	// 资产新地点 id 号
	private Date alterTime;	// 修改时间
	private File barCode;	// 条形码
	private Integer assetId;
	
	// 查询属性, 不在数据库映射
	private Location newLocation;
	private String strAlterTime;
	private AssetItem assetItem;

	public ExtendInf() {
		super();
	}

	public ExtendInf(String alterProgress, String alterReason, String alterAgentName, String alterSubmitUserName,
			Integer newLocationId, Date alterTime, File barCode, Integer assetId, Location newLocation,
			String strAlterTime, AssetItem assetItem) {
		super();
		this.alterProgress = alterProgress;
		this.alterReason = alterReason;
		this.alterAgentName = alterAgentName;
		this.alterSubmitUserName = alterSubmitUserName;
		this.newLocationId = newLocationId;
		this.alterTime = alterTime;
		this.barCode = barCode;
		this.assetId = assetId;
		this.newLocation = newLocation;
		this.strAlterTime = strAlterTime;
		this.assetItem = assetItem;
	}

	public Integer getExtendId() {
		return extendId;
	}

	public void setExtendId(Integer extendId) {
		this.extendId = extendId;
	}

	public String getAlterProgress() {
		return alterProgress;
	}

	public void setAlterProgress(String alterProgress) {
		this.alterProgress = alterProgress;
	}

	public String getAlterReason() {
		return alterReason;
	}

	public void setAlterReason(String alterReason) {
		this.alterReason = alterReason;
	}

	public String getAlterAgentName() {
		return alterAgentName;
	}

	public void setAlterAgentName(String alterAgentName) {
		this.alterAgentName = alterAgentName;
	}

	public String getAlterSubmitUserName() {
		return alterSubmitUserName;
	}

	public void setAlterSubmitUserName(String alterSubmitUserName) {
		this.alterSubmitUserName = alterSubmitUserName;
	}

	public Integer getNewLocationId() {
		return newLocationId;
	}

	public void setNewLocationId(Integer newLocationId) {
		this.newLocationId = newLocationId;
	}

	public Date getAlterTime() {
		return alterTime;
	}

	public void setAlterTime(Date alterTime) {
		this.alterTime = alterTime;
	}

	public File getBarCode() {
		return barCode;
	}

	public void setBarCode(File barCode) {
		this.barCode = barCode;
	}

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public Location getNewLocation() {
		return newLocation;
	}

	public void setNewLocation(Location newLocation) {
		this.newLocation = newLocation;
	}

	public String getStrAlterTime() {
		return strAlterTime;
	}

	public void setStrAlterTime(String strAlterTime) {
		this.strAlterTime = strAlterTime;
	}

	public AssetItem getAssetItem() {
		return assetItem;
	}

	public void setAssetItem(AssetItem assetItem) {
		this.assetItem = assetItem;
	}

	@Override
	public String toString() {
		return "ExtendInf [extendId=" + extendId + ", alterProgress=" + alterProgress + ", alterReason=" + alterReason
				+ ", alterAgentName=" + alterAgentName + ", alterSubmitUserName=" + alterSubmitUserName
				+ ", newLocationId=" + newLocationId + ", alterTime=" + alterTime + ", barCode=" + barCode
				+ ", assetId=" + assetId + ", newLocation=" + newLocation + ", strAlterTime=" + strAlterTime
				+ ", assetItem=" + assetItem + "]";
	}

}
