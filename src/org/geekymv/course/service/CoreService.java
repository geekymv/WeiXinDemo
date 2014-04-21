package org.geekymv.course.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.geekymv.course.entity.Article;
import org.geekymv.course.message.resp.RespNewsMessage;
import org.geekymv.course.message.resp.RespTextMessage;
import org.geekymv.course.util.CreateTimeSwap;
import org.geekymv.course.util.MessageType;
import org.geekymv.course.util.MessageUtil;

/**
 * 核心业务类
 */
public class CoreService {
	
	/**
	 * 处理微信发来的请求
	 * @param request
	 * @return
	 */
	public static String processRequest(HttpServletRequest request){

		String respMessage = "";	//响应的消息
		
		try {
			//默认返回的文本信息
			String respContent = "这是默认返回的文本信息！";
			
			//xml请求解析
			Map<String, String> requestMap = MessageUtil.parseXml(request);
		
			String FromUserName = requestMap.get("FromUserName");	//普通号
			String ToUserName = requestMap.get("ToUserName");		//公共号
			String CreateTime = requestMap.get("CreateTime");
			String FromCreateTime = CreateTimeSwap.swapTime(CreateTime);
			
			String MsgType = requestMap.get("MsgType");
		
			RespTextMessage textMessage = new RespTextMessage();

			textMessage.setToUserName(FromUserName);
			textMessage.setFromUserName(ToUserName);
			textMessage.setCreateTime(new java.util.Date().getTime());
			textMessage.setMsgType(MessageType.RESP_MESSAGE_TYPE_TEXT);
			
			//请求时文本消息
			if(MessageType.REQ_MESSAGE_TYPE_TEXT.equals(MsgType)){
				
				String Content = requestMap.get("Content");
				
				if("?".equals(Content) || "？".equals(Content)){
					respContent = getMainMenu();	//返回主菜单
					
				}else if("1".equals(Content)){
					
				}else if("2".equals(Content)){
					
				}else if("3".equals(Content)){
					
				}else if("4".equals(Content)){
					
				}else if("5".equals(Content)){
					//回复关于作者的图文消息
					respMessage  = getAuthorInfo(FromUserName, ToUserName);
					return respMessage;
					
				}else {
					respContent = "对方发送信息的类型 = " + MsgType + "\n" 
							+ "对方发送信息的内容 = " + Content + "\n" 
							+ "对方发送信息的时间 = " + FromCreateTime + "\n" 
							+ "公共号 = " + textMessage.getFromUserName() + "\n"
							+ "发给 = " + textMessage.getToUserName();
				}
				
			}else if(MessageType.REQ_MESSAGE_TYPE_IMAGE.equals(MsgType)){
				respContent = "您发送的是图片消息!";
			
			}else if(MessageType.REQ_MESSAGE_TYPE_LINK.equals(MsgType)){
				respContent = "你发送的是链接消息！";
			
			}else if(MessageType.REQ_MESSAGE_TYPE_LOCATION.equals(MsgType)){
				respContent = "你发送的是地理位置消息！";
			
			}else if(MessageType.REQ_MESSAGE_TYPE_VOICE.equals(MsgType)){
				respContent = "你发送的是语音消息！";
			
			}else if(MessageType.REQ_MESSAGE_TYPE_EVENT.equals(MsgType)){	//事件
				
				String eventType = requestMap.get("Event");
				
				if(MessageType.EVENT_TYPE_SUBSCRIBE.equals(eventType)){	//订阅
					respContent = "谢谢您的订阅，接下来我们可以一块玩耍了!\n\n"
									+ "请回复数字选择服务：\n"
									+ "1. 天气预报\n"
									+ "2. 公交查询\n"
									+ "3. 歌曲点播\n"
									+ "4. 聊天唠嗑\n"
									+ "5. 关于作者\n\n"
									+ "回复\"?\"显示此帮助菜单";;
					
				}else if(MessageType.EVENT_TYPE_UNSUBSCRIBE.equals(eventType)){	//取消订阅
					// 取消订阅后，用户将收不到公共号发送的消息
					
				}else if(MessageType.EVENT_TYPE_SCAN.equals(eventType)){
					respContent = "用户已关注该公众帐号，扫描了带场景值的二维码";
					
				}else if(MessageType.EVENT_TYPE_CLICK.equals(eventType)){	//事件点击
					   // 事件KEY值，与创建自定义菜单时指定的KEY值对应  
                    String eventKey = requestMap.get("EventKey");  
  
                    if (eventKey.equals("11")) {  
                        respContent = "天气预报菜单项被点击！";  
                    } else if (eventKey.equals("12")) {  
                        respContent = "公交查询菜单项被点击！";  
                    } else if (eventKey.equals("13")) {  
                        respContent = "周边搜索菜单项被点击！";  
                    } else if (eventKey.equals("14")) {  
                        respContent = "历史上的今天菜单项被点击！";  
                    } else if (eventKey.equals("21")) {  
                        respContent = "歌曲点播菜单项被点击！";  
                    } else if (eventKey.equals("22")) {  
                        respContent = "经典游戏菜单项被点击！";  
                    } else if (eventKey.equals("23")) {  
                        respContent = "美女电台菜单项被点击！";  
                    } else if (eventKey.equals("24")) {  
                        respContent = "人脸识别菜单项被点击！";  
                    } else if (eventKey.equals("25")) {  
                        respContent = "聊天唠嗑菜单项被点击！";  
                    } else if (eventKey.equals("31")) {  
                        respContent = "Q友圈菜单项被点击！";  
                    } else if (eventKey.equals("32")) {  
                        respContent = "电影排行榜菜单项被点击！";  
                    } else if (eventKey.equals("33")) {  
                        respContent = "幽默笑话菜单项被点击！";  
                    }
					
				}else if(MessageType.EVENT_TYPE_VIEW.equals(eventType)){	//点击跳转
					
				}
			}
			
			textMessage.setContent(respContent);
			
			respMessage = MessageUtil.textMessageToXml(textMessage);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return respMessage;
		
	} 
	
	/**
	 * 主菜单
	 * @return
	 */
	private static String getMainMenu(){
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("您好，我是微信公共平台测试号").append("\n\n");
		buffer.append("请回复数字选择服务：").append("\n");
		buffer.append("1. 天气预报").append("\n");
		buffer.append("2. 公交查询").append("\n");
		buffer.append("3. 歌曲点播").append("\n");
		buffer.append("4. 聊天唠嗑").append("\n");
		buffer.append("5. 关于作者").append("\n\n");
		buffer.append("回复\"?\"显示此帮助菜单");
		
		return buffer.toString();
	}
	
	/**
	 * 回复关于作者的图文消息
	 * @return
	 */
	private static String getAuthorInfo(String FromUserName, String ToUserName){

		List<Article> articles = new ArrayList<Article>();
		
		Article article = new Article();
		article.setTitle("关于作者的信息");
		article.setDescription("Geek_ymv, 90后程序员，热爱编程，希望在此遇到更多志同道合的朋友！");
		article.setPicUrl("http://tp3.sinaimg.cn/2462100650/180/40006713120/1.jpg");
		article.setUrl("http://blog.csdn.net/geek_ymv");

		//添加一个
		articles.add(article);
		
		
		RespNewsMessage newsMessage = new RespNewsMessage();
		
		newsMessage.setFromUserName(ToUserName);
		newsMessage.setToUserName(FromUserName);
		newsMessage.setMsgType(MessageType.RESP_MESSAGE_TYPE_NEWS);
		newsMessage.setCreateTime(new java.util.Date().getTime());
		newsMessage.setArticles(articles);

		newsMessage.setArticleCount(articles.size()+"");
		
		String respMessage = MessageUtil.newsMessageToXml(newsMessage);
		
		return respMessage;
	}
}












































