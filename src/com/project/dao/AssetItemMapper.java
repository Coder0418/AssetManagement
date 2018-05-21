package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.AssetItem;

@Repository
@MapperScan
public interface AssetItemMapper {
	
	/**
	 * 通过资产项目 id 号查询资产项目信息
	 * @param assetItemId
	 * @return
	 */
	public AssetItem getAssetItemById(Integer assetItemId);
	
	/**
	 * 通过资产项目名称查询资产项目信息
	 * @param assetName
	 * @return
	 */
	public AssetItem getAssetItemByName(String assetName);
	
	/**
	 * 通过资产入库时间查询资产项目信息
	 * @param storageTime
	 * @return
	 */
	public List<AssetItem> getAssetItemByYear(String storageTime);
	
	/**
	 * 通过资产项目对象属性作为查询条件, 查询资产项目信息
	 * @param assetItem
	 * @return
	 */
	public AssetItem getAssetItem(AssetItem assetItem);
	
	/**
	 * 添加资产项目信息, 添加后返回主键 id
	 * @param assetItem
	 * @return
	 */
	public int addAssetItem(AssetItem assetItem);
	
	/**
	 * 更新资产项目信息
	 * @param assetItem
	 */
	public void updateAssetItem(AssetItem assetItem);
	
	/**
	 * 通过资产项目 id 号删除执行资产项目
	 * @param assetId
	 */
	public void deleteAssetItemById(Integer assetId);
	
	/**
	 * 查询所有资产信息项目
	 * @return
	 */
	public List<AssetItem> getAllAssetItem();
	
	/**
	 * 以 assetItem 属性作为模糊查询条件, 查询资产项目信息
	 * @param assetItem
	 * @return
	 */
	public List<AssetItem> getAssetItemListForLike(AssetItem assetItem);
	
	/**
	 * 获取指定用户的所有资产
	 * @param userId
	 * @return
	 */
	public List<AssetItem> getAssetItemListByUserId(Integer userId);
	
}
