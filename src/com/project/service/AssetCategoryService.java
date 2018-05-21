package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.AssetCategory;
import com.project.dao.AssetCategoryMapper;

@Service
public class AssetCategoryService {
	
	@Autowired
	private AssetCategoryMapper assetCategoryMapper;

	// 按照主键查询
	public AssetCategory getAssetCategoryById(Integer assetCategoryId) {
		return assetCategoryMapper.getAssetCategoryById(assetCategoryId);
	}

	// 添加一条数据
	public int addAssetCategory(AssetCategory assetCategory) {
		return assetCategoryMapper.addAssetCategory(assetCategory);
	}

	// 更新一条数据
	public void updateAssetCategory(AssetCategory assetCategory) {
		assetCategoryMapper.updateAssetCategory(assetCategory);
	}

	// 删除一条数据
	public void deleteAssetCategoryById(Integer assetCategoryId) {
		assetCategoryMapper.deleteAssetCategoryById(assetCategoryId);
	}

	// 显示所有目录列表
	public List<AssetCategory> getAllAssetCategory() {
		return assetCategoryMapper.getAllAssetCategory();
	}

}
