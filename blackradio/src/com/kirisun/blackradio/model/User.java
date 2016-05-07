/**
 * 文件名：User.java
 * 版本信息：Version 1.0
 * 日期：2016年5月5日
 * Copyright 结点科技 Corporation 2016 
 * 版权所有
 */
package com.kirisun.blackradio.model;

import java.io.Serializable;

/**
 * 类描述：eee
 * 
 * @version: 1.0
 * @author: liuwu
 * @version: 2016年5月5日 下午1:22:22
 */
public class User implements Serializable {

	/* serialVersionUID: serialVersionUID */
	private static final long serialVersionUID = -3142370416731147338L;
	private Integer id;
	private String bid;
	private String pwd;
	private String role;
	private String desc;

	/**
	 * @return id : return the property id.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            : set the property id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return bid : return the property bid.
	 */
	public String getBid() {
		return bid;
	}

	/**
	 * @param bid
	 *            : set the property bid.
	 */
	public void setBid(String bid) {
		this.bid = bid;
	}

	/**
	 * @return pwd : return the property pwd.
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd
	 *            : set the property pwd.
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return role : return the property role.
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 *            : set the property role.
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return desc : return the property desc.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *            : set the property desc.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
