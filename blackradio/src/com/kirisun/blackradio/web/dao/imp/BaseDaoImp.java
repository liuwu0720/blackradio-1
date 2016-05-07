/**
 * 文件名：BaseDaoImp.java
 * 版本信息：Version 1.0
 * 日期：2016年5月5日
 * Copyright 结点科技 Corporation 2016 
 * 版权所有
 */
package com.kirisun.blackradio.web.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kirisun.blackradio.util.Page;
import com.kirisun.blackradio.web.dao.IBaseDao;

/**
 * 类描述：
 * 
 * @version: 1.0
 * @author: liuwu
 * @version: 2016年5月5日 下午2:44:31
 */
public class BaseDaoImp implements IBaseDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int commonUpdate(String sql, Object... paramValue) {
		return jdbcTemplate.update(sql, paramValue);
	}

	public Map<String, Object> getSpringSQL(String sql, Page page) {
		Map<String, Object> result = new HashMap<String, Object>();

		int count = getCountSQL(sql);
		if (page != null) {
			page.setRecordCount(count);
		}

		result.put("total", count);

		sql = getMySQLPageSQL(sql, page);
		System.out.println("base Dao spring " + sql);
		List<Map<String, Object>> arlist = jdbcTemplate.queryForList(sql);

		result.put("rows", arlist);

		String srtr = JSONArray.fromObject(arlist).toString();
		System.out.println("srtr" + srtr);
		System.out.println(arlist.size());

		return result;
	}

	/**
	 * 方法描述：
	 * 
	 * @param sql
	 * @param page
	 * @return
	 * @version: 1.0
	 * @author: liuwu
	 * @version: 2016年5月5日 下午2:50:35
	 */
	private String getMySQLPageSQL(String queryString, Page page) {
		if (StringUtils.isEmpty(queryString)) {
			return null;
		}

		String endSql = "";
		if (page == null) {
			endSql = queryString;
		} else {
			int endIndex = page.getFirstResult() + page.getRecordCountperPage();
			endSql = queryString + " limit " + page.getFirstResult() + ","
					+ endIndex;
		}

		return endSql;
	}

	// 根据sql 返回查询count的sql
	public int getCountSQL(String sql) {
		String countsql = " select count(*) coun from ( " + sql + " ) as total";
		int recordCount = jdbcTemplate.queryForInt(countsql);
		return recordCount;
	}
}
