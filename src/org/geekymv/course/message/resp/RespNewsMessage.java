package org.geekymv.course.message.resp;

import java.util.List;

import org.geekymv.course.entity.Article;

/**
 * �ظ�ͼ����Ϣ��
 */
public class RespNewsMessage extends RespBaseMessage{
	
	private String ArticleCount;	// 	�� 	ͼ����Ϣ����������Ϊ10������
	private List<Article> Articles;	// 	�� 	����ͼ����Ϣ��Ϣ��Ĭ�ϵ�һ��itemΪ��ͼ,ע�⣬���ͼ��������10���򽫻�����Ӧ
	
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
