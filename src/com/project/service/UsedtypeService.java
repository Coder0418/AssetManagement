package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.Usedtype;
import com.project.dao.UsedtypeMapper;

@Service
public class UsedtypeService {
	@Autowired
	private UsedtypeMapper usertypeMapper;
	//通过 id 号获取<资产使用方向>对象
	public Usedtype getUsedtypeById(Integer usedtypeId) {
		return usertypeMapper.getUsedtypeById(usedtypeId);
	}
	//通过方向名称获取<资产使用方向>对象
	public Usedtype getUsedtypeByName(String typeName) {
		return usertypeMapper.getUsedtypeByName(typeName);
	}
	//添加<资产使用方向>对象并返回主键 id
	public int addUsedtype(Usedtype usedtype) {
		return usertypeMapper.addUsedtype(usedtype);
	}
	//通过 id号删除<资产使用方向>对象
	public void deleteUsedtypeById(Integer id) {
		usertypeMapper.deleteUsedtypeById(id);
	}
	//更新 Usedtype 对象
	public void updateUsedtype(Usedtype usedtype) {
		usertypeMapper.updateUsedtype(usedtype);
	}
	//获取所有<资产使用方向>对象
	public List<Usedtype> getAllUsedtype(){
		return usertypeMapper.getAllUsedtype();
	}
	
}
