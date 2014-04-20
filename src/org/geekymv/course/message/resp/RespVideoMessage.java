package org.geekymv.course.message.resp;

/**
 * 回复视频消息类
 */
public class RespVideoMessage extends RespBaseMessage{
	
	private String MediaId;		// 	是 	通过上传多媒体文件，得到的id
	private String Title;		// 	否 	视频消息的标题
	private String Description;	// 	否 	视频消息的描述 
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
}
