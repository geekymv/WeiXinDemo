package org.geekymv.course.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.geekymv.course.message.resp.RespTextMessage;
import org.geekymv.course.util.CreateTimeSwap;
import org.geekymv.course.util.MessageUtil;

/**
 * 核心业务类
 * private String ToUserName; // 开发者微信号
	private String FromUserName; // 发送方帐号（一个OpenID）
	private long CreateTime; // 消息创建时间 （整型）
	private String MsgType; // 消息类型（text/image/location/link）
	private long MsgId; // 消息id，64位整型
 */
public class CoreService {
	
	public static String processRequest(HttpServletRequest request){

		String respMessage = "";
		
		try {
			//xml请求解析
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			
		
			String FromUserName = requestMap.get("FromUserName");	//普通号
			String ToUserName = requestMap.get("ToUserName");		//公共号
			String CreateTime = requestMap.get("CreateTime");
		
			String FromCreateTime = CreateTimeSwap.swapTime(CreateTime);
			
			String MsgType = requestMap.get("MsgType");
		
			
			//请求时文本消息
			if(MessageUtil.REQ_MESSAGE_TYPE_TEXT.equals(MsgType)){
				
				String Content = requestMap.get("Content");
				
				
				RespTextMessage textMessage = new RespTextMessage();
				textMessage.setToUserName(FromUserName);
				textMessage.setFromUserName(ToUserName);
				textMessage.setCreateTime(new java.util.Date().getTime());
				textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
				
				textMessage.setContent("对方发送信息的类型 = " + MsgType + "\n" 
						+ "对方发送信息的内容 = " + Content + "\n" 
						+ "对方发送信息的时间 = " + FromCreateTime + "\n" 
						+ "公共号 = " + textMessage.getFromUserName() + "\n"
						+ "发给 = " + textMessage.getToUserName() + "\n" 
						
						);
				
				respMessage = MessageUtil.textMessageToXml(textMessage);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return respMessage;
	} 

}
