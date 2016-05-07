/**
 * 文件名：AccessServlet.java
 * 版本信息：Version 1.0
 * 日期：2016年5月6日
 * Copyright 结点科技 Corporation 2016 
 * 版权所有
 */
package com.kirisun.blackradio.web.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kirisun.blackradio.model.User;
import com.kirisun.blackradio.util.AjaxUtil;
import com.kirisun.blackradio.util.SystemCommon;
import com.kirisun.blackradio.web.service.IUserService;
import com.wordnik.swagger.annotations.Api;

/**
 * 类描述：web权限登录
 * 
 * @version: 1.0
 * @author: liuwu
 * @version: 2016年5月6日 下午2:36:39
 */
@Controller
@RequestMapping("/accessServlet")
@Api(value = "accessServlet-api", description = "web权限登录接口", position = 5)
public class AccessServlet {

	@Autowired
	IUserService iUserService;

	@RequestMapping(value = "/login")
	public void login(String bid, String pwd, HttpServletRequest request,
			HttpServletResponse response) {
		User user = new User();
		user.setBid(bid);
		user.setPwd(pwd);
		try {
			User checkUser = iUserService.findUser(user);
			if (checkUser != null) {
				AjaxUtil.rendResult(response, SystemCommon.CODE_SUCCESS, "成功");
				request.getSession().setAttribute(SystemCommon.SESSION_USER,
						checkUser);
			} else {
				AjaxUtil.rendResult(response, SystemCommon.CODE_ERROR1,
						"用户名或密码错误");
			}
		} catch (Exception e) {
			e.printStackTrace();
			AjaxUtil.rendResult(response, SystemCommon.CODE_ERROR2, "系统错误");
		}
	}
}
