package com.project.beans;

/**
 * 资产用途
 * 
 * @author yang
 *
 */
public class AssetsUsed {

	private Integer usedId; 	// 用途 id
	private String usedName; 	// 用途名称
	private String usedNumber;	// 用途编码

	public AssetsUsed() {
		super();
	}

	public AssetsUsed(Integer usedId, String usedName, String usedNumber) {
		super();
		this.usedId = usedId;
		this.usedName = usedName;
		this.usedNumber = usedNumber;
	}

	public Integer getUsedId() {
		return usedId;
	}

	public void setUsedId(Integer usedId) {
		this.usedId = usedId;
	}

	public String getUsedName() {
		return usedName;
	}

	public void setUsedName(String usedName) {
		this.usedName = usedName;
	}

	public String getUsedNumber() {
		return usedNumber;
	}

	public void setUsedNumber(String usedNumber) {
		this.usedNumber = usedNumber;
	}

	@Override
	public String toString() {
		return "AssetsUsed [usedId=" + usedId + ", usedName=" + usedName + ", usedNumber=" + usedNumber + "]";
	}

}
