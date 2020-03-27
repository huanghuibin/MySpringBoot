package com.example.demo.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜单权限表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-03-26 15:15:56
 */
@TableName("sys_menu")
public class SysMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 菜单ID
	 */
	@TableId
	private String menuId;
	/**
	 * 菜单名称
	 */
	private String menuName;
	/**
	 * 父菜单ID
	 */
	private String parentId;
	/**
	 * 请求地址
	 */
	private String url;
	/**
	 * 菜单类型（M目录 C菜单 F按钮）
	 */
	private String menuType;
	/**
	 * 权限标识
	 */
	private String perms;
	/**
	 * 创建者
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新者
	 */
	private String updateBy;
	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 设置：菜单ID
	 */
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	/**
	 * 获取：菜单ID
	 */
	public String getMenuId() {
		return menuId;
	}
	/**
	 * 设置：菜单名称
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * 获取：菜单名称
	 */
	public String getMenuName() {
		return menuName;
	}
	/**
	 * 设置：父菜单ID
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父菜单ID
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：请求地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：请求地址
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：菜单类型（M目录 C菜单 F按钮）
	 */
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	/**
	 * 获取：菜单类型（M目录 C菜单 F按钮）
	 */
	public String getMenuType() {
		return menuType;
	}
	/**
	 * 设置：权限标识
	 */
	public void setPerms(String perms) {
		this.perms = perms;
	}
	/**
	 * 获取：权限标识
	 */
	public String getPerms() {
		return perms;
	}
	/**
	 * 设置：创建者
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：创建者
	 */
	public String getCreateBy() {
		return createBy;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新者
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * 获取：更新者
	 */
	public String getUpdateBy() {
		return updateBy;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
