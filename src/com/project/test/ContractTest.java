package com.project.test;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.beans.Contract;
import com.project.beans.ContractCategory;
import com.project.beans.User;
import com.project.service.ContractCategoryService;
import com.project.service.ContractService;

public class ContractTest {

	@Autowired
	private ContractCategoryService contractCategoryService;
	
	@Autowired
	private ContractService contractService;
	
	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		contractCategoryService = (ContractCategoryService) applicationContext.getBean("contractCategoryService");
		contractService = (ContractService) applicationContext.getBean("contractService");
	}
	
	@Test
	public void testGetAllContractCategory() {
		List<ContractCategory> contractCategoryList = contractCategoryService.getAllContractCategory();
		System.out.println(contractCategoryList);
	}
	
	@Test
	public void testAddContract() {
		ContractCategory contractCategory = new ContractCategory();
		contractCategory.setContractCategoryId(2);
		
		Contract contract = new Contract("合同3", "123", 123.0, "公司3", "未审批", "申请人", "计算机科学与技术学院", new Date(), null, contractCategory);
		
		contractService.addContract(contract);
	}
	
	@Test
	public void testGetContractListForLike() {
		Contract contract = new Contract();
		contract.setApplicantName("用户1");
		
		List<Contract> contractList = contractService.getContractListForLike(contract);
		System.out.println(contractList);
	}

}
