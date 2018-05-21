package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.Usedtype;

@Repository
@MapperScan
public interface UsedtypeMapper {
	
	/**
	 * 通过 id 号获取<资产使用方向>对象
	 * @param id
	 * @return
	 */
	public Usedtype getUsedtypeById(Integer usedtypeId);
	
	/**
	 * 通过方向名称获取<资产使用方向>对象
	 * @param typeName
	 * @return
	 */
	public Usedtype getUsedtypeByName(String typeName);
	
	/**
	 * 添加<资产使用方向>对象并返回主键 id
	 * @param usedtype
	 * @return
	 */
	public int addUsedtype(Usedtype usedtype);
	
	/**
	 * 通过 id号删除<资产使用方向>对象
	 * @param id
	 */
	public void deleteUsedtypeById(Integer id);
	
	/**
	 * 更新 Usedtype 对象
	 * @param usedtype
	 */
	public void updateUsedtype(Usedtype usedtype);
	
	/**
	 * 获取所有<资产使用方向>对象
	 * @return
	 */
	public List<Usedtype> getAllUsedtype();
	
}
