package com.project.beans;

/**
 * 合同类别表
 * 
 * @author yang
 *
 */
public class ContractCategory {

	private Integer contractCategoryId; // 类别 id 号
	private String contractCategoryName; // 类别名称

	public ContractCategory() {
		super();
	}

	public ContractCategory(Integer contractCategoryId, String contractCategoryName) {
		super();
		this.contractCategoryId = contractCategoryId;
		this.contractCategoryName = contractCategoryName;
	}

	public Integer getContractCategoryId() {
		return contractCategoryId;
	}

	public void setContractCategoryId(Integer contractCategoryId) {
		this.contractCategoryId = contractCategoryId;
	}

	public String getContractCategoryName() {
		return contractCategoryName;
	}

	public void setContractCategoryName(String contractCategoryName) {
		this.contractCategoryName = contractCategoryName;
	}

	@Override
	public String toString() {
		return "ContractCategory [contractCategoryId=" + contractCategoryId + ", contractCategoryName="
				+ contractCategoryName + "]";
	}

}
