package com.adt.lyods.utils;

/**
 * 
 * @author lyodssoft.com
 * 
 * @creator xiesw
 * @version 1.0.0
 * @date 2014-11-11
 * @description Andriod Common Util Tools - Create
 *
 */

public class Util
{
	/**
	 * 判断是否为""或null
	 * 
	 * @param val
	 * @return true.为空格或null false.有内容
	 */
	public static boolean isEmpty(String val)
	{
		if (val == null || "".equals(val.trim()))
		{
			return true;
		} else
		{
			return false;
		}
	}

	public static String trim(String val)
	{
		if (val == null)
		{
			return "";
		} else
		{
			return val.trim();
		}
	}
}
