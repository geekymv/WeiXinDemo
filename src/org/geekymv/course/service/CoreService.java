package org.geekymv.course.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.geekymv.course.message.resp.RespTextMessage;
import org.geekymv.course.util.CreateTimeSwap;
import org.geekymv.course.util.MessageUtil;

/**
 * ����ҵ����
 * private String ToUserName; // ������΢�ź�
	private String FromUserName; // ���ͷ��ʺţ�һ��OpenID��
	private long CreateTime; // ��Ϣ����ʱ�� �����ͣ�
	private String MsgType; // ��Ϣ���ͣ�text/image/location/link��
	private long MsgId; // ��Ϣid��64λ����
 */
public class CoreService {
	
	public static String processRequest(HttpServletRequest request){

		String respMessage = "";
		
		try {
			//xml�������
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			
		
			String FromUserName = requestMap.get("FromUserName");	//��ͨ��
			String ToUserName = requestMap.get("ToUserName");		//������
			String CreateTime = requestMap.get("CreateTime");
		
			String FromCreateTime = CreateTimeSwap.swapTime(CreateTime);
			
			String MsgType = requestMap.get("MsgType");
		
			
			//����ʱ�ı���Ϣ
			if(MessageUtil.REQ_MESSAGE_TYPE_TEXT.equals(MsgType)){
				
				String Content = requestMap.get("Content");
				
				
				RespTextMessage textMessage = new RespTextMessage();
				textMessage.setToUserName(FromUserName);
				textMessage.setFromUserName(ToUserName);
				textMessage.setCreateTime(new java.util.Date().getTime());
				textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
				
				textMessage.setContent("�Է�������Ϣ������ = " + MsgType + "\n" 
						+ "�Է�������Ϣ������ = " + Content + "\n" 
						+ "�Է�������Ϣ��ʱ�� = " + FromCreateTime + "\n" 
						+ "������ = " + textMessage.getFromUserName() + "\n"
						+ "���� = " + textMessage.getToUserName() + "\n" 
						
						);
				
				respMessage = MessageUtil.textMessageToXml(textMessage);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return respMessage;
	} 

}
