package org.geekymv.course.message.req;

/**
 * ͼƬ��Ϣ
 */
public class ReqImageMessage extends ReqBaseMessage{
	
	private String PicUrl;	// 	ͼƬ����
	private String MediaId;	// 	ͼƬ��Ϣý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ� 
	
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

}
