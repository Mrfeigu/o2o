package com.lzh.o2o.util;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestUtil {
	
	/**
	 * 将请求转换成int
	 * @param request
	 * @param name
	 * @return
	 */
	public static int getInt(HttpServletRequest request, String name) {

		try {
			return Integer.decode(request.getParameter(name));
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * 将请求转换long类型
	 * @param request
	 * @param name
	 * @return
	 */
	public static long getLong(HttpServletRequest request, String name) {

		try {
			return Long.valueOf(request.getParameter(name));
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * 将请求转换成double类型
	 * @param request
	 * @param name
	 * @return
	 */
	public static Double getDouble(HttpServletRequest request, String name) {

		try {
			return Double.valueOf(request.getParameter(name));
		} catch (Exception e) {
			return -1d;
		}
	}

	/**
	 * 请求转换成boolean
	 * @param request
	 * @param name
	 * @return
	 */
	public static Boolean getBoolean(HttpServletRequest request, String name) {

		try {
			return Boolean.valueOf(request.getParameter(name));
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 将请求转换成处理的String
	 * @param request
	 * @param name
	 * @return
	 */
	public static String getString(HttpServletRequest request, String name) {
		try {
			String result = request.getParameter(name);
			if (result != null) {
				result = result.trim();
			}
			if ("".equals(result))
				result = null;
			return result;
		} catch (Exception e) {
			return null;
		}

	}
}