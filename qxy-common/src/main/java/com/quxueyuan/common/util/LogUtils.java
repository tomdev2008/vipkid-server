/** 
 * Project Name: mq_project 
 * File Name: LogUtils.java 
 * Package Name: com.huifenqi.mq.utils 
 * Date: 2016年2月1日下午9:22:50 
 * Copyright (c) 2016, www.huizhaofang.com All Rights Reserved. 
 * 
 */
package com.quxueyuan.common.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * ClassName: LogUtils date: 2016年2月1日 下午9:22:50 Description:
 * 
 * @author xiaozhan
 * @version
 * @since JDK 1.8
 */
public class LogUtils {

	/**
	 * 获取请求日志
	 * 
	 * @param request
	 * @return
	 */
	public static String getRequestLog(HttpServletRequest request) {
		StringBuilder sb = new StringBuilder();
		// 获取所有的参数
		sb.append("{");
		Enumeration<String> parameters = request.getParameterNames();
		if (parameters != null) {
			while (parameters.hasMoreElements()) {
				String name = parameters.nextElement();
				sb.append(name).append("=").append(request.getParameter(name)).append("; ");
			}
		}
		sb.append("}");
		return String.format("[REQUEST] mark=%s %s Accept[%s] %s", Thread.currentThread().getId(),
				request.getRequestURL(), request.getHeader("Accept"), sb.toString());
	}

	/**
	 * 获取响应的日志
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	public static String getResponseLog(int costTime, String content, String url) {
		return String.format("[RESPONSE] mark=%s %s [costime=%s] %s", Thread.currentThread().getId(), url, costTime,
				content);
	}

	/**
	 * 获取异常响应的日志
	 * 
	 * @param content
	 * @param url
	 * @return
	 */
	public static String getExceptionalResponseLog(String content, String url) {
		return String.format("[RESPONSE|EXCEPTION] mark=%s %s %s", Thread.currentThread().getId(), url, content);
	}

	/**
	 * 获取通用的日志
	 * 
	 * @param content
	 * @return
	 */
	public static String getCommLog(String content) {
		return String.format("[PROCESS] mark=%s %s", Thread.currentThread().getId(), content);
	}
}
