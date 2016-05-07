/**
 * 文件名：APIAction.java
 * 版本信息：Version 1.0
 * 日期：2016年5月5日
 * Copyright 结点科技 Corporation 2016 
 * 版权所有
 */
package com.kirisun.blackradio.web.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mangofactory.swagger.annotations.ApiIgnore;

/**
 * 类描述：
 * 
 * @version: 1.0
 * @author: liuwu
 * @version: 2016年5月5日 下午4:53:31
 */
@ApiIgnore
@Controller
@RequestMapping("/apiAction")
public class APIAction {
	@RequestMapping("/index")
	public String getIndex() {
		System.out.println("index***************");
		return "apiIndex";
	}
}
