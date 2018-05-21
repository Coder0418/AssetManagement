package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.ContractCategory;

@Repository
@MapperScan
public interface ContractCategoryMapper {

	/**
	 * 通过合同类别 id 获取 ContractCategory 对象
	 * @param contractCategoryId
	 * @return
	 */
	public ContractCategory getContractCategoryById(Integer contractCategoryId);
	
	/**
	 * 添加合同类别, 添加成功后返回主键
	 * @param contractCategory
	 * @return
	 */
	public int addContractCategory(ContractCategory contractCategory);
	
	/**
	 * 更新合同类别信息
	 * @param contractCategory
	 */
	public void updateContactCategory(ContractCategory contractCategory);
	
	/**
	 * 通过合同类别 id 号删除指定合同类别
	 * @param contractCategoryId
	 */
	public void deleteContractCategoryById(Integer contractCategoryId);
	
	/**
	 * 获取所有合同类别信息列表
	 * @return
	 */
	public List<ContractCategory> getAllContractCategory();
	
	/**
	 * 通过类别名称模糊查询合同类别信息
	 * @param contractCategoryName
	 * @return
	 */
	public List<ContractCategory> getContractCategoryListForLike(String contractCategoryName);
	
}
