package com.project.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.AssetItem;
import com.project.dao.AssetItemMapper;

@Service
public class AssetItemService {

	@Autowired
	private AssetItemMapper assetItemMapper;

	public List<AssetItem> getAllAssets() {
		List<AssetItem> assetItems = assetItemMapper.getAllAssetItem();
		List<AssetItem> resultList = new ArrayList<>();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		/*
		 * java.sql.Date转为java.util.Date
		 * 
		 * java.sql.Date date=new java.sql.Date(); java.util.Date d=new java.util.Date
		 * (date.getTime());
		 * 
		 */
		for (AssetItem assetItem : assetItems) {
			String purchaseTime = sdf.format(assetItem.getPurchaseTime());
			String storageTime = sdf.format(assetItem.getStorageTime());

			assetItem.setStrPurchaseTime(purchaseTime);
			assetItem.setStrStorageTime(storageTime);

			resultList.add(assetItem);
		}

		return resultList;
	}

	public List<AssetItem> getAssetItemListForLike(AssetItem assetItem) {
		List<AssetItem> assetItems = assetItemMapper.getAssetItemListForLike(assetItem);
		List<AssetItem> resultList = new ArrayList<>();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		/*
		 * java.sql.Date转为java.util.Date
		 * 
		 * java.sql.Date date=new java.sql.Date(); java.util.Date d=new java.util.Date
		 * (date.getTime());
		 * 
		 */
		for (AssetItem item : assetItems) {
			String purchaseTime1 = sdf.format(item.getPurchaseTime());
			String storageTime1 = sdf.format(item.getStorageTime());

			item.setStrPurchaseTime(purchaseTime1);
			item.setStrStorageTime(storageTime1);

			resultList.add(item);
		}

		return resultList;
	}

	public List<AssetItem> getAssetItemByYear(String storageTime) {
		List<AssetItem> assetItems = assetItemMapper.getAssetItemByYear(storageTime);
		List<AssetItem> resultList = new ArrayList<>();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		/*
		 * java.sql.Date转为java.util.Date
		 * 
		 * java.sql.Date date=new java.sql.Date(); java.util.Date d=new java.util.Date
		 * (date.getTime());
		 * 
		 */
		for (AssetItem assetItem : assetItems) {
			String purchaseTime1 = sdf.format(assetItem.getPurchaseTime());
			String storageTime1 = sdf.format(assetItem.getStorageTime());

			assetItem.setStrPurchaseTime(purchaseTime1);
			assetItem.setStrStorageTime(storageTime1);

			resultList.add(assetItem);
		}

		return resultList;
	}

	public void updateAssetItem(AssetItem assetItem) {
		assetItemMapper.updateAssetItem(assetItem);
	}

	public AssetItem getAssetById(Integer assetItemId) {
		return assetItemMapper.getAssetItemById(assetItemId);
	}

	public List<AssetItem> getAssetItemListByUserId(Integer userId) {
		return assetItemMapper.getAssetItemListByUserId(userId);
	}

}
