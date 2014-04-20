package org.geekymv.course.message.resp;

/**
 * 回复语音消息类
 */
public class RespVoiceMessage extends RespBaseMessage{
	
	private String MediaId;		// 	是 	通过上传多媒体文件，得到的id 

	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
}
