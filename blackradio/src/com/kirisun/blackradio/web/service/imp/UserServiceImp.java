/**
 * 文件名：UserServiceImp.java
 * 版本信息：Version 1.0
 * 日期：2016年5月4日
 * Copyright 结点科技 Corporation 2016 
 * 版权所有
 */
package com.kirisun.blackradio.web.service.imp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kirisun.blackradio.model.User;
import com.kirisun.blackradio.util.Page;
import com.kirisun.blackradio.web.dao.IUserDao;
import com.kirisun.blackradio.web.service.IUserService;

/**
 * 类描述：
 * 
 * @version: 1.0
 * @author: liuwu
 * @version: 2016年5月4日 下午11:23:48
 */
@Service
public class UserServiceImp implements IUserService {

	@Autowired
	IUserDao iUserDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.node.service.IUserService#findUser(com.node.model.User)
	 */
	@Override
	public User findUser(User user) {
		User u = iUserDao.findByUser(user.getBid());
		if (u.getId() != null && u.getPwd().equals(user.getPwd())) {
			return u;
		} else {
			return null;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.node.service.IUserService#getBySpringSql(java.lang.String,
	 * com.node.util.Page)
	 */
	@Override
	public Map<String, Object> getBySpringSql(String sql, Page page) {
		// TODO Auto-generated method stub
		return iUserDao.getSpringSQL(sql, page);
	}
}
