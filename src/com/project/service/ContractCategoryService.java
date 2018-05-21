package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.ContractCategory;
import com.project.dao.ContractCategoryMapper;

@Service
public class ContractCategoryService {
	
	@Autowired
	private ContractCategoryMapper contractCategoryMapper;

	public ContractCategory getContractCategoryById(Integer contractCategoryId) {
		return contractCategoryMapper.getContractCategoryById(contractCategoryId);

	}

	public int addContractCategory(ContractCategory contractCategory) {
		int id = 0;
		contractCategoryMapper.addContractCategory(contractCategory);
		id = contractCategory.getContractCategoryId();
		return id;
	}

	public void updateContactCategory(ContractCategory contractCategory) {
		contractCategoryMapper.updateContactCategory(contractCategory);
	}

	public void deleteContractCategoryById(Integer contractCategoryId) {
		contractCategoryMapper.deleteContractCategoryById(contractCategoryId);
	}

	public List<ContractCategory> getAllContractCategory() {
		return contractCategoryMapper.getAllContractCategory();
	}

	public List<ContractCategory> getContractCategoryListForLike(String contractCategoryName) {
		return contractCategoryMapper.getContractCategoryListForLike(contractCategoryName);
	}

}
