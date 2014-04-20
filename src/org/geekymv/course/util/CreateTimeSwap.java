package org.geekymv.course.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * ��CreateTime ����Ϊ��λ-->ת����ͨʱ�� 
 */
public class CreateTimeSwap {
	
	public static String swapTime(String CreateTime){
		
		Long formatTime = Long.parseLong(CreateTime) * 1000;	//����ת�ɺ���
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
