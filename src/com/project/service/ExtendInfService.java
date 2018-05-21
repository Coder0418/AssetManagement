package com.project.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.ExtendInf;
import com.project.dao.ExtendInfMapper;

@Service
public class ExtendInfService {

	@Autowired
	private ExtendInfMapper extendInfMapper;
	
	public ExtendInf getExtendInfById(Integer extendId) {
		return extendInfMapper.getExtendInfById(extendId);
	}

	public List<ExtendInf> getExtendInfListByAssetId(Integer assetId) {
		return extendInfMapper.getExtendInfByAssetId(assetId);
	}

	public ExtendInf getLastExtendInfByAssetId(Integer assetId) {
//		return extendInfMapper.getLastExtendInfByAssetId(assetId);
		
		ExtendInf extendInf = extendInfMapper.getLastExtendInfByAssetId(assetId);
		
		if(extendInf != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String alterTime = sdf.format(extendInf.getAlterTime());
			extendInf.setStrAlterTime(alterTime);
		}
		
		return extendInf;
	}

	public void addExtendInf(ExtendInf extendInf) {
		extendInfMapper.addExtendInf(extendInf);
	}
	
	public ExtendInf getAlterInfByAssetId(Integer assetId) {
		return extendInfMapper.getAlterInfByAssetId(assetId);
	}

	public void deleteExtendInfByExtendId(Integer extendId) {
		extendInfMapper.deleteExtendInfById(extendId);
	}
	
}
