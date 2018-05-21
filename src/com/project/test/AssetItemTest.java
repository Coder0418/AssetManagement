package com.project.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.beans.AssetCategory;
import com.project.beans.AssetItem;
import com.project.beans.ExtendInf;
import com.project.beans.User;
import com.project.service.AssetItemService;
import com.project.service.ExtendInfService;
import com.project.service.UserService;

public class AssetItemTest {
	
	@Autowired
	private AssetItemService assetItemService;
	
	@Autowired
	private UserService userService;
	
	private AssetItem assetItem;
	
	@Autowired
	private ExtendInfService extendInfService;
	
	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		assetItemService = (AssetItemService) applicationContext.getBean("assetItemService");
		userService = (UserService) applicationContext.getBean("userService");
		extendInfService = (ExtendInfService) applicationContext.getBean("extendInfService");
	}

	@Test
	public void test() {
		System.out.println(assetItemService.getAllAssets());
	}
	
	@Test
	public void testGetAssetForLike() {
		AssetItem assetItem = assetItemService.getAssetById(1);
		System.out.println(assetItem);
		
		List<AssetItem> retirementList = assetItemService.getAssetItemListForLike(assetItem);
		System.out.println(retirementList);
	}
	
	@Test
	public void test2() {
		AssetItem assetItem = new AssetItem();
		
		User user = new User();
		user.setUserName("yang");
		
		assetItem.setUsedDepartment("计算机");
		assetItem.setUser(user);
		
		List<AssetItem> itemList = assetItemService.getAssetItemListForLike(assetItem);
		System.out.println(itemList);
	}
	
	@Test
	public void test3() {
		String str = "2018";
		
		System.out.println(assetItemService.getAssetItemByYear(str));
	}
	
	@Test
	public void testCategoryQuery() {
		AssetCategory assetCategory = new AssetCategory();
		assetCategory.setCategoryId(2);
		
		assetItem = new AssetItem();
		assetItem.setAssetCategory(assetCategory);
		
		System.out.println("assetItem: " + assetItem);
		
		List<AssetItem> assetsList = assetItemService.getAssetItemListForLike(assetItem);
		System.out.println("结果个数为: " + assetsList.size());
		System.out.println("***" + assetsList);
	}
	
	@Test
	public void testGetRetirementItem() {
		AssetItem assetItem = new AssetItem();
		assetItem.setStatus(1);
		
		List<AssetItem> itemList = assetItemService.getAssetItemListForLike(assetItem);
		
		System.out.println(itemList);
	}
	
	@Test
	public void mtest() {
		User user = userService.getUserByUserId(1);
		
		AssetItem assetItem = new AssetItem();
		assetItem.setStatus(0);
		assetItem.setUser(user);
		List<AssetItem> assetList = assetItemService.getAssetItemListForLike(assetItem);
		System.out.println(assetList.size());
		System.out.println(assetList);
	}
	
	@Test
	public void testGetAssetItemListByUserId() {
		List<AssetItem> assetList = assetItemService.getAssetItemListByUserId(1);
		System.out.println(assetList.size());
	}
	
	@Test
	public void test4() {
		List<AssetItem> assetList = assetItemService.getAssetItemListByUserId(1);
		
		List<ExtendInf> alterInfList = new ArrayList<>();
		ExtendInf extendInf = null;
		
		for(int i=0; i<assetList.size(); i++) {
			Integer assetId = assetList.get(i).getAssetId();
//			System.out.println(extendInfService.getLastExtendInfByAssetId(assetId));
			extendInf = extendInfService.getLastExtendInfByAssetId(assetId);
			if(extendInf != null) {
				alterInfList.add(extendInf);
			}
		}
		
//		System.out.println(alterInfList.size());
//		System.out.println(alterInfList);
	}
	
}
