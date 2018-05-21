package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.ExtendInf;

@Repository
@MapperScan
public interface ExtendInfMapper {

	/**
	 * 通过扩展信息 id 号获取扩展信息对象
	 * @param extendId
	 * @return
	 */
	public ExtendInf getExtendInfById(Integer extendId);
	
	/**
	 * 获取所有 assetId 的最后一条扩展信息项
	 * @param assetId
	 * @return
	 */
	public ExtendInf getLastExtendInfByAssetId(Integer assetId);
	
	/**
	 * 添加设备扩展信息, 并返回添加主键值
	 * @param extendInf
	 * @return
	 */
	public int addExtendInf(ExtendInf extendInf);
	
	/**
	 * 通过扩展 id 号删除扩展信息
	 * @param extendId
	 */
	public void deleteExtendInfById(Integer extendId);
	
	/**
	 * 更新扩展信息
	 * @param extendInf
	 */
	public void updateExtendInf(ExtendInf extendInf);
	
	/**
	 * 获取所有扩展信息
	 * @return
	 */
	public List<ExtendInf> getAllExtendInf();
	
	/**
	 * 通过 assetId 获取扩展信息
	 * @param assetId
	 * @return
	 */
	public List<ExtendInf> getExtendInfByAssetId(Integer assetId);
	
	/**
	 * 获取指定资产扩展信息的最后一条记录
	 * e.g select * from ExtendInf where alterProgress = '未审批'
	 * and assetId = 3 
     * order by extendId desc limit 1
     * 
	 * @param assetId
	 * @return
	 */
	public ExtendInf getAlterInfByAssetId(Integer assetId);
	
}
