package com.project.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.beans.AssetCategory;
import com.project.beans.AssetItem;
import com.project.beans.Department;
import com.project.beans.ExtendInf;
import com.project.beans.Location;
import com.project.beans.User;
import com.project.service.AssetItemService;
import com.project.service.DepartmentService;
import com.project.service.ExtendInfService;
import com.project.service.LocationService;
import com.project.service.UserService;

@Controller
public class AssetItemController {
	
	@Autowired
	private AssetItemService assetItemService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private ExtendInfService extendInfService;
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("/assetsCondition")
	public String assetsCondition(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		return "assets-generalCondition";
	}
	
	// 跳转查询设备与软件页面
	@RequestMapping("/integratedQuery")
	public String integratedQuery(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		return "assets-integratedQuery";
	}
	
	// 跳转家具物资查询页面
	@RequestMapping("/furnitureQuery")
	public String furnitureQuery(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		return "assets-furnitureQuery";
	}
	
	// 跳转室外构筑物查询
	@RequestMapping("/outsideBuildingQuery")
	public String outsideBuildingQuery(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		return "assets-outsideBuildingQuery";
	}
	
	// 跳转资产统计信息页面
	@RequestMapping("/assetStatisticsQuery")
	public String assetStatisticsQuery(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		return "assets-assetStatisticsQuery";
	}
	
	@RequestMapping(value="/getAllItems")
	public String getAllItems(Map<String, Object> map, HttpSession session, AssetItem assetItem) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		List<AssetItem> assetsList = assetItemService.getAssetItemListForLike(assetItem);
		System.out.println("***" + assetsList);
		
		map.put("assetsList", assetsList);
		
		return "assets-integratedQuery";
	}

	@RequestMapping(value="/getFurnitures")
	public String getFurnitures(Map<String, Object> map, HttpSession session, AssetItem assetItem) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		if(assetItem.getAssetEquityMax() == 0) {
			assetItem.setAssetEquityMax(99999999);
		}
		AssetCategory assetCategory = new AssetCategory();
		assetCategory.setCategoryId(2);
		assetItem.setAssetCategory(assetCategory);
		
		System.out.println("assetItem: " + assetItem);
		
		List<AssetItem> assetsList = assetItemService.getAssetItemListForLike(assetItem);
		System.out.println("***" + assetsList);
		
		map.put("assetsList", assetsList);
		
		return "assets-furnitureQuery";
	}
	
	// 发送资产报废申请页面
	@RequestMapping("/assetRetirement")
	public String assetRetirement(Map<String, Object> map, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		AssetItem assetItem = new AssetItem();
		assetItem.setStatus(1);
		assetItem.setUser(user);
		
		List<AssetItem> assetList = assetItemService.getAssetItemListForLike(assetItem);
		map.put("assetsList", assetList);
		
		return "assets-retirementApplication";
	}
	
	@RequestMapping("/retirementSubmit")
	public String retirementSubmit(Map<String, Object> map, HttpSession session, @RequestParam(value="assetItems", required=false) Integer[] ids) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		AssetItem assetItem = null;
		if(ids != null) {
			for (int i = 0; i < ids.length; i++) {
				assetItem = new AssetItem();
				assetItem.setAssetId(ids[i]);
				assetItem.setStatus(0);	// 设置状态为已报废
				assetItem.setUser(user);
				
				assetItemService.updateAssetItem(assetItem);
			}
		}
		assetItem = new AssetItem();
		assetItem.setStatus(1);
		assetItem.setUser(user);
		
		List<AssetItem> assetList = assetItemService.getAssetItemListForLike(assetItem);
		map.put("assetsList", assetList);
		
		return "assets-retirementApplication";
	}
	
	// 撤销报废申请页面
	@RequestMapping("/revokeRetirement")
	public String revokeRetirement(Map<String, Object> map, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		AssetItem assetItem = new AssetItem();
		assetItem.setStatus(0);
		
		// 取回报废资产
		List<AssetItem> itemList = assetItemService.getAssetItemListForLike(assetItem);
//		System.out.println("报废资产: " + itemList);
		map.put("assetsList", itemList);
		
		return "assets-revokeRetirement";
	}
	
	// 撤销选中报废资产
	@RequestMapping("/revokeRetirementSubmit")
	public String revokeRetirementSubmit(Map<String, Object> map, HttpSession session, @RequestParam(value="assetItems", required=false) Integer[] ids) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		AssetItem assetItem = null;
		if(ids != null) {
			for (int i = 0; i < ids.length; i++) {
				assetItem = new AssetItem();
				
				assetItem = new AssetItem();
				assetItem.setAssetId(ids[i]);
				assetItem.setStatus(1);	// 设置状态为正在使用
				assetItem.setUser(user);
				
				assetItemService.updateAssetItem(assetItem);
			}
		}
		
		return "assets-revokeRetirement";
	}
	
	// 查询报废信息
	@RequestMapping("/getRetirementsInf")
	public String getRetirementsInf(Map<String, Object> map, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		AssetItem assetItem = new AssetItem();
		assetItem.setStatus(0);
		assetItem.setUser(user);
		
		List<AssetItem> retirementList = assetItemService.getAssetItemListForLike(assetItem);
		map.put("retirementList", retirementList);
		
		return "assets-retirementInf";
	}
	
	// 资产修改调拨申请
	@RequestMapping("/alterAssetApplication")
	public String alterAsset(Map<String, Object> map, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		// 取出以 user 为领用人的所有	正在使用	的资产
		AssetItem assetItem = new AssetItem();
		assetItem.setStatus(1);
		assetItem.setUser(user);
		
		List<AssetItem> assetList = assetItemService.getAssetItemListForLike(assetItem);
//		System.out.println(assetList.size());
//		System.out.println(assetList);
		map.put("assetList", assetList);
		
		return "assets-alterInf";
	}
	
	// 1.取出 user 为领用人的所有	正在使用	的资产
	
	// 2.根据资产 id 号获取所有资产扩展信息
	
	// 3.进行判断, 若取出的扩展信息列表为空, 添加扩展信息; 若部位空, 更新扩展信息
	
	@RequestMapping("assetEdit")
	public String alterAssetEdit(Map<String, Object> map, HttpSession session, @RequestParam(value="assetId", required=false) Integer assetId) {
		AssetItem assetItem = assetItemService.getAssetById(assetId);
		
		System.out.println(assetItem);
		
		map.put("assetItem", assetItem);
		
		List<Department> departmentList = departmentService.getAllDepartment();
		map.put("departmentList", departmentList);
		
		List<Location> locationList = locationService.getAllLocations();
		map.put("locationList", locationList);
		
		List<User> userList = userService.getAllUsers();
		map.put("userList", userList);
		
		return "assets-edit";
	}
	
	@RequestMapping("/alterAssetSubmit")
	public String alterAssetSubmit(Map<String, Object> map, HttpSession session, AssetItem assetItem, @RequestParam(value="alterReason", required=false) String alterReason) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		// 获取新的领用人信息
		User applicant = userService.getUserByUserId(assetItem.getUser().getUserId());
		
		ExtendInf extendInf = new ExtendInf();
		extendInf.setAlterProgress("未审批");
		extendInf.setAlterReason(alterReason);
		extendInf.setAlterAgentName(applicant.getNickName());		// 变更领用人
		extendInf.setAlterSubmitUserName(user.getNickName());
		extendInf.setNewLocationId(assetItem.getAssetLocation().getLocationId()); 	// 新地点 id 号
		extendInf.setAlterTime(new Date());
		extendInf.setAssetId(assetItem.getAssetId());
		
		extendInfService.addExtendInf(extendInf);
		
		assetItem = new AssetItem();
		assetItem.setStatus(1);
		assetItem.setUser(user);
		
		List<AssetItem> assetList = assetItemService.getAssetItemListForLike(assetItem);
		map.put("assetList", assetList);
		
		return "assets-alterInf";
	}
	
	// 撤销资产调拨信息
	@RequestMapping("/alterAssetRevoke")
	public String alterAssetRevoke(Map<String, Object> map, HttpSession session) {

		// 1. 取用户
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		// 2. 资产表中取用户对应资产放入 alterInfList 列表中
		List<AssetItem> assetList = assetItemService.getAssetItemListByUserId(user.getUserId());
		List<ExtendInf> alterInfList = new ArrayList<>();
		ExtendInf extendInf = null;
		Location newLocation = null;
		
		for(int i=0; i<assetList.size(); i++) {
			Integer assetId = assetList.get(i).getAssetId();
			System.out.println(assetId);
			extendInf = extendInfService.getLastExtendInfByAssetId(assetId);
			if(extendInf != null) {
				newLocation = locationService.getLocationById(extendInf.getNewLocationId());
				extendInf.setAssetItem(assetList.get(i));
				extendInf.setNewLocation(newLocation);
				alterInfList.add(extendInf);
			}
		}
//		System.out.println("alterInfList: " + alterInfList);
		
		map.put("alterInfList", alterInfList);
		
		return "assets-alterAssetRevoke";
	}
	
	@RequestMapping("alterAssetRevokeSubmit")
	public String alterAssetRevokeSubmit(Map<String, Object> map, HttpSession session, @RequestParam(value="extendInfList", required=false) Integer[] ids) {
		
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		if(ids != null) {
			for(int i=0; i<ids.length; i++) {
				extendInfService.deleteExtendInfByExtendId(ids[i]);
			}
		}
		
		List<AssetItem> assetList = assetItemService.getAssetItemListByUserId(user.getUserId());
		List<ExtendInf> alterInfList = new ArrayList<>();
		ExtendInf extendInf = null;
		Location newLocation = null;
		
		for(int i=0; i<assetList.size(); i++) {
			Integer assetId = assetList.get(i).getAssetId();
//			System.out.println(assetId);
			extendInf = extendInfService.getLastExtendInfByAssetId(assetId);
			if(extendInf != null) {
				newLocation = locationService.getLocationById(extendInf.getNewLocationId());
				extendInf.setAssetItem(assetList.get(i));
				extendInf.setNewLocation(newLocation);
				alterInfList.add(extendInf);
			}
		}
//		System.out.println("alterInfList: " + alterInfList);
		
		map.put("alterInfList", alterInfList);
		
		return "assets-alterAssetRevoke";
	}
	
	@RequestMapping("/getAlterAssetInf")
	public String getAlterAssetInf(Map<String, Object> map, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		// 获取数据当前用户的所有资产
		AssetItem assetItem = new AssetItem();
		assetItem.setStatus(1);
		assetItem.setUser(user);
		
		List<AssetItem> assetList = assetItemService.getAssetItemListForLike(assetItem);
		System.out.println(assetList.size());
		System.out.println("assetList: " + assetList);
		
		map.put("assetList", assetList);
		
		return "assets-getAlterInf";
	}
	
	@RequestMapping("getDetailExtendInf")
	public String getDetailExtendInf(Map<String, Object> map, HttpSession session, @RequestParam(value="assetId", required=false) Integer assetId) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login.jsp";
		}
		
		AssetItem assetItem = null;
		Location newLocation = null;
		ExtendInf extendInf = null;
		
		List<ExtendInf> extendListList = extendInfService.getExtendInfListByAssetId(assetId);
		List<ExtendInf> detailList = new ArrayList<>();
//		System.out.println(detailList);
		for(int i=0; i<extendListList.size(); i++) {
			extendInf = extendListList.get(i);
			
			assetItem = assetItemService.getAssetById(extendInf.getAssetId());
			newLocation = locationService.getLocationById(extendInf.getNewLocationId());
			
			extendInf.setAssetItem(assetItem);
			extendInf.setNewLocation(newLocation);
			extendInf.setStrAlterTime(changeDateToString(extendInf.getAlterTime()));
			
			detailList.add(extendInf);
		}
		
		map.put("detailList", detailList);
		
		return "assets-detailInf";
	}
	
	public String changeDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = sdf.format(date);
		return strDate;
	}
	
}
