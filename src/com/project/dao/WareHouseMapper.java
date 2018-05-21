package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.WareHouseAsset;

@MapperScan
@Repository
public interface WareHouseMapper {

	/**
	 * 通过入库资产 id 号查询入库资产项目
	 * @param assetItemId
	 * @return
	 */
	public WareHouseAsset getWareHouseByAssetItemId(Integer assetItemId);
	
	/**
	 * 添加入库资产项目
	 * @param wareHouseAsset
	 * @return
	 */
	public int addWareHouseAsset(WareHouseAsset wareHouseAsset);
	
	/**
	 * 更新资产数量
	 * @param assetItemNumber
	 */
	public void updateAssetNumber(Integer assetItemNumber);
	
	/**
	 * 通过年限查询查询入库资产列表
	 * @param storageTime
	 * @return
	 */
	public List<WareHouseAsset> getAssetListByStorageTime(String storageTime);
	
	/**
	 * 查询所有入库资产
	 * @return
	 */
	public List<WareHouseAsset> getAllAsset();
	
	/**
	 * 通过入库原因查询所有资产
	 * @param reason
	 * @return
	 */
	public List<WareHouseAsset> getWareHouseAssetListByReason(String reason);
	
	/**
	 * 通过入库资产名称模糊查询入库资产列表
	 * @param assetItemName
	 * @return
	 */
	public List<WareHouseAsset> getWareHouseAssetListByName(String assetItemName);
	
	/**
	 * 通过入库资产 id 号删除指定入库资产
	 * @param assetItemId
	 */
	public void deleteWareHouseAssetById(Integer assetItemId);
	
}
