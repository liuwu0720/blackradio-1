/**
 * 文件名：IUserService.java
 * 版本信息：Version 1.0
 * 日期：2016年5月4日
 * Copyright 结点科技 Corporation 2016 
 * 版权所有
 */
package com.kirisun.blackradio.web.service;

import java.util.Map;

import com.kirisun.blackradio.model.User;
import com.kirisun.blackradio.util.Page;

/**
 * 类描述：
 * 
 * @version: 1.0
 * @author: liuwu
 * @version: 2016年5月4日 下午11:23:22
 */
public interface IUserService {

	/**
	 * 方法描述：
	 * 
	 * @param user
	 * @return
	 * @version: 1.0
	 * @author: liuwu
	 * @version: 2016年5月5日 下午1:37:33
	 */
	User findUser(User user);

	/**
	 * 方法描述：
	 * 
	 * @param sql
	 * @param page
	 * @return
	 * @version: 1.0
	 * @author: liuwu
	 * @version: 2016年5月5日 下午3:08:42
	 */
	Map<String, Object> getBySpringSql(String sql, Page page);

}
