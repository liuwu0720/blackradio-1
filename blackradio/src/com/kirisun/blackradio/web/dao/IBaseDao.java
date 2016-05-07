/**
 * 文件名：IBaseDao.java
 * 版本信息：Version 1.0
 * 日期：2016年5月5日
 * Copyright 结点科技 Corporation 2016 
 * 版权所有
 */
package com.kirisun.blackradio.web.dao;

import java.util.Map;

import com.kirisun.blackradio.util.Page;

/**
 * 类描述：
 * 
 * @version: 1.0
 * @author: liuwu
 * @version: 2016年5月5日 下午2:47:34
 */
public interface IBaseDao {
	public Map<String, Object> getSpringSQL(String sql, Page page);

	public int commonUpdate(String sql, Object... paramValue);
}
