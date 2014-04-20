package org.geekymv.course.message.req;

/**
 * 文本消息
 */
public class ReqTextMessage extends ReqBaseMessage{
	
	private String Content;	 //	文本消息内容 

	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}

}
