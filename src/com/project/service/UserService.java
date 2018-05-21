package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.User;
import com.project.dao.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserByUserId(Integer userId) {
		return userMapper.getUserById(userId);
	}

	public User getUserByUserNameAndPassWord(String userName, String passWord) {
		return userMapper.getUserByUserNameAndPassWord(userName, passWord);
	}

	public List<User> getAllUsers() {
		return userMapper.getUserAllUsers();
	}
	
}
