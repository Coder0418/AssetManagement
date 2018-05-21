package com.project.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.beans.Contract;
import com.project.beans.ContractCategory;
import com.project.beans.Department;
import com.project.beans.User;
import com.project.service.ContractCategoryService;
import com.project.service.ContractService;
import com.project.service.DepartmentService;

@Controller
public class ContractController {
	
	@Autowired
	private ContractService contractService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private ContractCategoryService contractCategoryService;

	@ResponseBody
	@RequestMapping("/getAllContractApplication")
	public List<Contract> getAllContractApplication() {
		List<Contract> contractList = contractService.getAllContracts();
		
		System.out.println(contractList);
		
		return contractList;
	}
	
	// 跳转至合同申请页面
	@RequestMapping("/contractApplication")
	public String contractApplication(Map<String, Object> map) {
		List<Department> departmentList = departmentService.getAllDepartment();
		List<ContractCategory> contractCategoryList = contractCategoryService.getAllContractCategory();
		map.put("departmentList", departmentList);
		map.put("contractCategoryList", contractCategoryList);
		
		return "contract/contract-contractApplication";
	}
	
	@RequestMapping("/addContract")
	public String addContract(Map<String, Object> map, Contract contract) {
		System.out.println(contract);
		contractService.addContract(contract);
		
		List<Department> departmentList = departmentService.getAllDepartment();
		List<ContractCategory> contractCategoryList = contractCategoryService.getAllContractCategory();
		map.put("departmentList", departmentList);
		map.put("contractCategoryList", contractCategoryList);
		
		return "contract/contract-contractApplication";
	}
	
	@RequestMapping("/getApplication")
	public String getApplication(Map<String, Object> map, HttpSession session) {
		User user = (User) session.getAttribute("user");
		String applicantName = user.getNickName();
		
		Contract contract = new Contract();
		contract.setApplicantName(applicantName);
		
		List<Contract> contractList = contractService.getContractListForLike(contract);
		System.out.println(contractList);
		map.put("contractList", contractList);
		
		return "contract/contract-getUserContract";
	}
	
}
