package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.AssetsUsed;

@Repository
@MapperScan
public interface AssetsUsedMapper {

	/**
	 * 通过资产用途 id 号获取资产用途信息
	 * @param assetUsedId
	 * @return
	 */
	public AssetsUsed getAssetsUsedById(Integer assetUsedId);
	
	/**
	 * 添加资产用途, 添加成功后返回主键 id
	 * @param assetsUsed
	 * @return
	 */
	public int addAssetsUsed(AssetsUsed assetsUsed);
	
	/**
	 * 更新资产用途对象
	 * @param assetsUsed
	 */
	public void updateAssetsUsed(AssetsUsed assetsUsed);
	
	/**
	 * 通过资产用途 id 号删除指定资产用途对象
	 * @param assetsUsedId
	 */
	public void deleteAssetsUsedById(Integer assetsUsedId);
	
	/**
	 * 获取所有资产用途信息
	 * @return
	 */
	public List<AssetsUsed> getAllAssetsUsed();
	
	/**
	 * 以 assetsUsed 对象属性作为模糊条件, 查询 资产用途信息
	 * @param assetsUsed
	 * @return
	 */
	public List<AssetsUsed> getAssetsUsedListForLike(AssetsUsed assetsUsed);
	
}
