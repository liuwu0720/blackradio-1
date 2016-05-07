/**
 * 文件名：UserDaoImp.java
 * 版本信息：Version 1.0
 * 日期：2016年5月4日
 * Copyright 结点科技 Corporation 2016 
 * 版权所有
 */
package com.kirisun.blackradio.web.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.kirisun.blackradio.model.User;
import com.kirisun.blackradio.web.dao.IUserDao;

/**
 * 类描述：
 * 
 * @version: 1.0
 * @author: liuwu
 * @version: 2016年5月4日 下午11:25:03
 */
@Repository
public class UserDaoImp extends BaseDaoImp implements IUserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.node.dao.IUserDao#findByUser(java.lang.String)
	 */
	@Override
	public User findByUser(String bid) {
		String sqlStr = "select * from user where bid=?";
		final User user = new User();
		jdbcTemplate.query(sqlStr, new Object[] { bid },
				new RowCallbackHandler() {
					@Override
					public void processRow(ResultSet rs) throws SQLException {

						user.setId(rs.getInt("id"));
						user.setBid(rs.getString("bid"));
						user.setPwd(rs.getString("pwd"));

					}

				});
		return user;
	}

}
