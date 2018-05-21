package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.Department;
import com.project.dao.DepartmentMapper;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;

	/**
	 * 通过部门 id 获取部门信息
	 * 
	 * @param departmentId
	 * @return
	 */
	public Department getDepartmentById(Integer departmentId) {
		return departmentMapper.getDepartmentById(departmentId);
	}

	/**
	 * 添加部门, 添加成功后返回主键
	 * 
	 * @param department
	 * @return
	 */
	public int addDepartment(Department department) {
		return departmentMapper.addDepartment(department);
	}

	public void deleteDepartmentById(Integer departmentId) {
		departmentMapper.deleteDepartmentById(departmentId);
	}

	/**
	 * 更新部门信息
	 * 
	 * @param department
	 */
	public void updateDepartment(Department department) {
		departmentMapper.updateDepartment(department);
	}

	/**
	 * 获取所有部门信息
	 * 
	 * @return
	 */
	public List<Department> getAllDepartment() {
		return departmentMapper.getAllDepartment();
	}

}
