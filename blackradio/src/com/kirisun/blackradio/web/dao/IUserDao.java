/**
 * 文件名：IUserDao.java
 * 版本信息：Version 1.0
 * 日期：2016年5月4日
 * Copyright 结点科技 Corporation 2016 
 * 版权所有
 */
package com.kirisun.blackradio.web.dao;

import com.kirisun.blackradio.model.User;

/**
 * 类描述：
 * 
 * @version: 1.0
 * @author: liuwu
 * @version: 2016年5月4日 下午11:24:37
 */
public interface IUserDao extends IBaseDao {

	/**
	 * 方法描述：
	 * 
	 * @param bid
	 * @return
	 * @version: 1.0
	 * @author: liuwu
	 * @version: 2016年5月5日 下午1:40:41
	 */
	User findByUser(String bid);

}
