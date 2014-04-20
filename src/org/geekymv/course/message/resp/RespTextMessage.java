package org.geekymv.course.message.resp;

/**
 * 回复文本消息类
 */
public class RespTextMessage extends RespBaseMessage{
		
	private String Content;		// 	是 	回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示） 

	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
}
