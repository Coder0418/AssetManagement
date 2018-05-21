package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.Contract;

@Repository
@MapperScan
public interface ContractMapper {

	/**
	 * 通过合同 id 号获取合同信息
	 * @param contractId
	 * @return
	 */
	public Contract getContractById(Integer contractId);
	
	/**
	 * 通过申请单号获取合同信息
	 * @param applicationNumber
	 * @return
	 */
	public Contract getContractByApplicationNumber(String applicationNumber);
	
	/**
	 * 以 Contract 对象属性作为查询条件, 查询合同信息
	 * @param contract
	 * @return
	 */
	public Contract getContract(Contract contract);
	
	/**
	 * 添加新合同对象
	 * @param contract
	 * @return
	 */
	public int addContract(Contract contract);

	/**
	 * 通过合同 id 号删除合同对象信息
	 * @param contractId
	 */
	public void deleteContractById(Integer contractId);
	
	/**
	 * 更新合同信息
	 * @param contract
	 */
	public void updateContract(Contract contract);
	
	/**
	 * 获取合同信息
	 * @return
	 */
	public List<Contract> getAllContracts();
	
	/**
	 * 通过 contract 对象信息进行模糊查询
	 * @param contract
	 * @return
	 */
	public List<Contract> getContractListForLike(Contract contract);
	
}
