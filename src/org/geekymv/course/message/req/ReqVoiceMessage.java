package org.geekymv.course.message.req;

/**
 * ������Ϣ
 */
public class ReqVoiceMessage extends ReqBaseMessage{
	
	private String MediaId;	// 	������Ϣý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ�
	private String Format;	// 	������ʽ����amr��speex�� 
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	
}
