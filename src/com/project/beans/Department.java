package com.project.beans;

import java.util.List;

/**
 * 部门表(单位表)
 * @author yang
 *
 */
public class Department {

	private Integer departmentId;	// 部门 id
	private String departmentName;	// 部门名称
	
	private List<User> userList;	// 部门对应用户

	public Department() {
		super();
	}

	public Department(Integer departmentId, String departmentName, List<User> userList) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.userList = userList;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", userList="
				+ userList + "]";
	}
	
}
