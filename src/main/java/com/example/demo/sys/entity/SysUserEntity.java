package com.example.demo.sys.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-03-26 15:15:56
 */
@TableName("sys_user")
public class SysUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@TableId
	private Long userId;
	/**
	 * 用户昵称
	 */
	private String username;
	/**
	 * 用户邮箱
	 */
	private String email;
	/**
	 * 手机号码
	 */
	private String phonenumber;
	/**
	 * 用户性别（0男 1女 2未知）
	 */
	private String sex;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 盐加密
	 */
	private String salt;
	/**
	 * 删除标志
	 */
	private String deleteFlag;
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
	 * 设置：用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：用户昵称
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户昵称
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：用户邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：用户邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：手机号码
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * 获取：手机号码
	 */
	public String getPhonenumber() {
		return phonenumber;
	}
	/**
	 * 设置：用户性别（0男 1女 2未知）
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：用户性别（0男 1女 2未知）
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：盐加密
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}
	/**
	 * 获取：盐加密
	 */
	public String getSalt() {
		return salt;
	}
	/**
	 * 设置：删除标志
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	/**
	 * 获取：删除标志
	 */
	public String getDeleteFlag() {
		return deleteFlag;
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
