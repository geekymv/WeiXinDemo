package org.geekymv.course.message.resp;

/**
 * �ظ�������Ϣ��
 */
public class RespVoiceMessage extends RespBaseMessage{
	
	private String MediaId;		// 	�� 	ͨ���ϴ���ý���ļ����õ���id 

	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
}
