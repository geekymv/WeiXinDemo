package org.geekymv.weixin.pojo;

/**
 * 普通按钮(子按钮)：
 * 子菜单：没有子菜单的菜单项，有可能是二级菜单项，也有可能是不含二级菜单的一级菜单。
 * type name key
 */
public class CommonButton extends Button{
	
	private String type;
	private String key;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
