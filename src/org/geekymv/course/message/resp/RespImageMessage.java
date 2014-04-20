package org.geekymv.course.message.resp;

/**
 * 回复图片消息类
 */
public class RespImageMessage extends RespBaseMessage{
	
	private String MediaId;		// 	是 	通过上传多媒体文件，得到的id。

	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
}
