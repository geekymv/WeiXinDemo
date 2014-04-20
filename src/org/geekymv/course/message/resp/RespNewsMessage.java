package org.geekymv.course.message.resp;

import java.util.List;

import org.geekymv.course.entity.Article;

/**
 * 回复图文消息类
 */
public class RespNewsMessage extends RespBaseMessage{
	
	private String ArticleCount;	// 	是 	图文消息个数，限制为10条以内
	private List<Article> Articles;	// 	是 	多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应
	
	public String getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(String articleCount) {
		ArticleCount = articleCount;
	}
	public List<Article> getArticles() {
		return Articles;
	}
	public void setArticles(List<Article> articles) {
		Articles = articles;
	}

	

}
