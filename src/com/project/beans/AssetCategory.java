package com.project.beans;

/**
 * 资产类别表
 * 
 * @author yang
 *
 */
public class AssetCategory {

	private Integer categoryId; // 类别 id 号
	private String categoryName; // 类别名称

	public AssetCategory() {
		super();
	}

	public AssetCategory(Integer categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "AssetCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

}
