package org.geekymv.course.message.req;

/**
 * 语音消息
 */
public class ReqVoiceMessage extends ReqBaseMessage{
	
	private String MediaId;	// 	语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
	private String Format;	// 	语音格式，如amr，speex等 
	
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
