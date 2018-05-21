package com.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.beans.User;
import com.project.service.UserService;

@Controller
@RequestMapping(value="/userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/userLogin")
	public String userLogin(@RequestParam("form-username") String userName, @RequestParam("form-password") String passWord, HttpSession session) {
		System.out.println(userName);
		System.out.println(passWord);
		User user = userService.getUserByUserNameAndPassWord(userName, passWord);
		//System.out.println("23: " + user);
		if(user == null) {
			// 无当前用户, 跳转至失败页面
			return "error";
		} else {
			// 有当前用户，跳转至主界面
			session.setAttribute("user", user);
			
			return "index";
		}
//		return "success";
	}
	
	@RequestMapping("/getUsers")
	public String getUsers() {
		
		return "list";
	}
	
}
