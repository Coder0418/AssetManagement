package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.Contract;
import com.project.dao.ContractMapper;

@Service
public class ContractService {

	@Autowired
	private ContractMapper contractMapper;

	public List<Contract> getAllContracts() {
		return contractMapper.getAllContracts();
	}

	public Integer addContract(Contract contract) {
		contractMapper.addContract(contract);
		return contract.getContractId();
	}

	public List<Contract> getContractListForLike(Contract contract) {
		return contractMapper.getContractListForLike(contract);
	}

}
