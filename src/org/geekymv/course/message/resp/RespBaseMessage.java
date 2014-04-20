package org.geekymv.course.message.resp;

/**
 * 消息基类（公众帐号 -> 普通用户
 */
public class RespBaseMessage {
									//是否必须
	private String ToUserName; 		//是 	接收方帐号（收到的OpenID）
	private String FromUserName; 	//是 	开发者微信号
	private Long CreateTime; 		//是 	消息创建时间 （整型）
	private String MsgType;		 	//是 	消息类型	(text/music/news) 
	
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public Long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	
	
}
