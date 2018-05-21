package com.project.beans;

import org.springframework.stereotype.Component;

/**
 * 用户表
 * @author yang
 *
 */
@Component
public class User {

	private Integer userId;		// 用户 id 号
	private String userNumber;	// 用户编号
	private String nickName;	// 昵称
	private String userName;	// 登录名
	private String passWord;	// 登陆密码
	private Integer permission;	// 用户权限	5：管理员	3：普通用户
	
	private Department department;	// 用户隶属单位(部门)
	
	public User() {
		super();
	}

	public User(Integer userId, String userNumber, String nickName, String userName, String passWord,
			Integer permission, Department department) {
		super();
		this.userId = userId;
		this.userNumber = userNumber;
		this.nickName = nickName;
		this.userName = userName;
		this.passWord = passWord;
		this.permission = permission;
		this.department = department;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getPermission() {
		return permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userNumber=" + userNumber + ", nickName=" + nickName + ", userName="
				+ userName + ", passWord=" + passWord + ", permission=" + permission + ", department=" + department
				+ "]";
	}
	
}
