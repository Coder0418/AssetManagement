package com.project.beans;

/**
 * 资产使用方向表(类型)
 * 1.教学		2.科研	3.行政	4.社会服务		5.其他
 * 
 * @author yang
 *
 */
public class Usedtype {

	private Integer typeId; 	// 方向 id 号
	private String typeName; 	// 方向名称

	public Usedtype() {
		super();
	}

	public Usedtype(Integer typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "Usedtype [typeId=" + typeId + ", typeName=" + typeName + "]";
	}

}
