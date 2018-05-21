package com.project.beans;

import java.util.Date;

/**
 * 合同表
 * @author yang
 *
 */
public class Contract {

	private Integer contractId;			// 合同 id 号
	private String contractName;		// 合同名称
	private String applicationNumber;	// 申请单号码
	private Double payment;				// 支付金额
	private String oppositeCompany;		// 对方单位
	private String progress;			// 流程进度
	private String applicantName;		// 申请人姓名
	private String applicantCompany;	// 申请人单位
	private Date applyTime;				// 申请时间
	private Date printTime;				// 打印时间
	
	private ContractCategory contractCategory;	// 合同类别

	public Contract() {
		super();
	}
	
	public Contract(String contractName, String applicationNumber, Double payment, String oppositeCompany,
			String progress, String applicantName, String applicantCompany, Date applyTime, Date printTime,
			ContractCategory contractCategory) {
		super();
		this.contractName = contractName;
		this.applicationNumber = applicationNumber;
		this.payment = payment;
		this.oppositeCompany = oppositeCompany;
		this.progress = progress;
		this.applicantName = applicantName;
		this.applicantCompany = applicantCompany;
		this.applyTime = applyTime;
		this.printTime = printTime;
		this.contractCategory = contractCategory;
	}

	public Contract(Integer contractId, String contractName, String applicationNumber, Double payment,
			String oppositeCompany, String progress, String applicantName, String applicantCompany, Date applyTime,
			Date printTime, ContractCategory contractCategory) {
		super();
		this.contractId = contractId;
		this.contractName = contractName;
		this.applicationNumber = applicationNumber;
		this.payment = payment;
		this.oppositeCompany = oppositeCompany;
		this.progress = progress;
		this.applicantName = applicantName;
		this.applicantCompany = applicantCompany;
		this.applyTime = applyTime;
		this.printTime = printTime;
		this.contractCategory = contractCategory;
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public String getOppositeCompany() {
		return oppositeCompany;
	}

	public void setOppositeCompany(String oppositeCompany) {
		this.oppositeCompany = oppositeCompany;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantCompany() {
		return applicantCompany;
	}

	public void setApplicantCompany(String applicantCompany) {
		this.applicantCompany = applicantCompany;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public Date getPrintTime() {
		return printTime;
	}

	public void setPrintTime(Date printTime) {
		this.printTime = printTime;
	}

	public ContractCategory getContractCategory() {
		return contractCategory;
	}

	public void setContractCategory(ContractCategory contractCategory) {
		this.contractCategory = contractCategory;
	}

	@Override
	public String toString() {
		return "Contract [contractId=" + contractId + ", contractName=" + contractName + ", applicationNumber="
				+ applicationNumber + ", payment=" + payment + ", oppositeCompany=" + oppositeCompany + ", progress="
				+ progress + ", applicantName=" + applicantName + ", applicantCompany=" + applicantCompany
				+ ", applyTime=" + applyTime + ", printTime=" + printTime + ", contractCategory=" + contractCategory
				+ "]";
	}

}
