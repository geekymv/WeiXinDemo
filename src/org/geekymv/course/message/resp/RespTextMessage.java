package org.geekymv.course.message.resp;

/**
 * �ظ��ı���Ϣ��
 */
public class RespTextMessage extends RespBaseMessage{
		
	private String Content;		// 	�� 	�ظ�����Ϣ���ݣ����У���content���ܹ����У�΢�ſͻ��˾�֧�ֻ�����ʾ�� 

	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
}
