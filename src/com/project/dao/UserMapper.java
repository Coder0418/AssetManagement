package com.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.User;

@MapperScan
@Repository
public interface UserMapper {

	/**
	 * 根据指定用户 id 查询用户
	 * @param userId: 指定用户的 id 号
	 * @return 查询得到的用户
	 */
	public User getUserById(Integer userId);
	
	/**
	 * 查看指定用户名的用户是否存在(用户名验证)
	 * @param userName 指定的用户名
	 * @return 
	 */
	public User getUserByUserName(String userName);
	
	/**
	 * 通过用户名及密码查看用户是否存在(登陆使用)
	 * @param userName: 用户登录名
	 * @param passWord: 用户密码
	 * @return
	 */
	public User getUserByUserNameAndPassWord(@Param("userName")String userName, @Param("passWord")String passWord);
	
	/**
	 * 删除指定 id 号的用户
	 * @param userId： 指定用户的 id 号
	 */
	public void deleteUserById(Integer userId);
	
	/**
	 * 添加用户
	 * @param user： 添加的 User 对象
	 */
	public void addUser(User user);
	
	/**
	 * 通过指定 User 对象的属性更新用户
	 * @param user： 更新的 User 对象
	 */
	public void updateUser(User user);
	
	/**
	 * 查询用户表中用户的个数
	 * @return
	 */
	public int getUserNumber();
	
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> getUserAllUsers();
	
	/**
	 * 通过 User 对象中的条件进行模糊查询
	 * @param user：用 User 对象的属性作为模糊查询的条件
	 * @return
	 */
	public List<User> getUserForList(String userName);
	
}
