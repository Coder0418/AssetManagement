package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.AssetsUsed;
import com.project.dao.AssetsUsedMapper;

@Service
public class AssetsUsedService {
	@Autowired
	private AssetsUsedMapper assetsUsedMapper;

	// 主键查询一条
	public AssetsUsed getAssetsUsedById(Integer assetUsedId) {
		return assetsUsedMapper.getAssetsUsedById(assetUsedId);
	}

	// 添加数据返回主键
	public int addAssetsUsed(AssetsUsed assetsUsed) {
		int id = 0;

		assetsUsedMapper.addAssetsUsed(assetsUsed);
		id = assetsUsed.getUsedId();
		return id;
	}

	// 对象更新
	public void updateAssetsUsed(AssetsUsed assetsUsed) {
		assetsUsedMapper.updateAssetsUsed(assetsUsed);
	}

	// delete
	public void deleteAssetsUsedById(Integer assetsUsedId) {
		assetsUsedMapper.deleteAssetsUsedById(assetsUsedId);
	}

	// 获取所有数据
	public List<AssetsUsed> getAllAssetsUsed() {
		return assetsUsedMapper.getAllAssetsUsed();
	}

	// 模糊查询
	public List<AssetsUsed> getAssetsUsedListForLike(AssetsUsed assetsUsed) {
		return assetsUsedMapper.getAssetsUsedListForLike(assetsUsed);
	}

}
