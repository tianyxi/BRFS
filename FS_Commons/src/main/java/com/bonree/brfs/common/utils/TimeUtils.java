package com.bonree.brfs.common.utils;

public final class TimeUtils {
	
	/**
	 * 获取指定时间所在的时间区间字符串
	 * 
	 * @param now
	 * @param interval
	 * @return
	 */
	public static String timeInterval(long now, long interval) {
		StringBuilder builder = new StringBuilder();
		long last = (now - now % interval);
		builder.append(last).append('_').append(last + interval);
		
		return builder.toString();
	}
}
