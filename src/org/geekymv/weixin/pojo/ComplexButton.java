package org.geekymv.weixin.pojo;

/**
 * 父菜单项的封装：
 * 包含二级菜单的一级菜单 
 * name sub_button是一个子菜单项数组
 * 
 */
public class ComplexButton extends Button{
	
	private Button[] sub_button;

	public Button[] getSub_button() {
		return sub_button;
	}
	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}
	
}
