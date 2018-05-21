package com.project.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.project.beans.Department;

@Repository
@MapperScan
public interface DepartmentMapper {

	/**
	 * 通过部门 id 获取部门信息
	 * @param departmentId
	 * @return
	 */
	public Department getDepartmentById(Integer departmentId);
	
	/**
	 * 添加部门, 添加成功后返回主键
	 * @param department
	 * @return
	 */
	public int addDepartment(Department department);
	
	/**
	 * 通过部门 id 删除部门
	 * @param departmentId
	 */
	public void deleteDepartmentById(Integer departmentId);
	
	/**
	 * 更新部门信息
	 * @param department
	 */
	public void updateDepartment(Department department);
	
	/**
	 * 获取所有部门信息
	 * @return
	 */
	public List<Department> getAllDepartment();
	
	
}
