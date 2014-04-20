package org.geekymv.course.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * 将CreateTime 以秒为单位-->转成普通时间 
 */
public class CreateTimeSwap {
	
	public static String swapTime(String CreateTime){
		
		Long formatTime = Long.parseLong(CreateTime) * 1000;	//将秒转成毫秒
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return dateFormat.format(new java.util.Date(formatTime));
	}
	
//	public static void main(String[] args) {
//		
//		String nowTime = (System.currentTimeMillis()/1000) + "";
//		
//		String time = CreateTimeSwap.swapTime(nowTime);
//		
//		System.out.println(time);
//	}

}
