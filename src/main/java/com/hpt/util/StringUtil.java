package com.hpt.util;

import java.util.regex.Pattern;

public class StringUtil {
	public static boolean isNull(String ...params) {
		if(params == null) {
			return true;
		}

		if(params.length <= 0) {
			return true;
		}

		for(String param : params) {
			if(param == null || "".equals(param)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 判断是否为汉字,中间可以输入空格，且最少不能少于两个
	 * @param params
	 * @return boolean
	 */
	public static boolean isChinese(String ...params) {
		if(isNull(params)) {
			return false;
		}
		for(String param : params) {
			int count = 0;
			int n = 0;
			for(int i = 0; i < param.length(); i++) {
				n = (int)param.charAt(i);
				if(19968 <= n && n <40869) {
					count ++;
				}else if(n != 32){
					return false;
				}
			}
			if(count < 2) {
				return false;
			}
		}
		return true;
	}

	/*方法二：推荐，速度最快
	 * 判断是否为整数 
	 * @param str 传入的字符串 
	 * @return 是整数返回true,否则返回false 
	 */

	public static boolean isInteger(String ...params) {  
		if(isNull(params)) {
			return false;
		}
		for(String param : params) {
			Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
			if(!pattern.matcher(param).matches()) {
				return false;
			}
		}
		return true;
	}

	public static boolean isTrainFormat(String ...params) {
		for(String param : params) {
			if(!(param.startsWith("G") || param.startsWith("K") ||param.startsWith("T") ||param.startsWith("Z") || param.startsWith("D"))) {
				return false;
			}
		}
		return true;
	}
}
