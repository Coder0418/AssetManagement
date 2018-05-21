package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.AssetCategory;

@Repository
@MapperScan
public interface AssetCategoryMapper {

	/**
	 * 通过资产分类 id 获取资产分类对象
	 * @param assetCategoryId
	 * @return
	 */
	public AssetCategory getAssetCategoryById(Integer assetCategoryId);
	
	/**
	 * 添加资产分类信息
	 * @param assetCategory
	 * @return
	 */
	public int addAssetCategory(AssetCategory assetCategory);
	
	/**
	 * 更新资产分类信息
	 * @param assetCategory
	 */
	public void updateAssetCategory(AssetCategory assetCategory);
	
	/**
	 * 通过资产分类 id 删除指定资产分类信息
	 * @param assetCategoryId
	 */
	public void deleteAssetCategoryById(Integer assetCategoryId);
	
	/**
	 * 获取所有资产分类信息
	 * @return
	 */
	public List<AssetCategory> getAllAssetCategory();
	
}
