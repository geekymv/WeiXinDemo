package org.geekymv.weixin.pojo;

/**
 * 微信通用接口凭证
 */
public class AccessToken {

	/*
	 * mQAJp2AaxJGQqXLYq2UfP-y6J7j8gNFwxCAiBpyfKUj2_B-mS6Sly8ivBYBviUbqek4nB-
	 * RVgu5tqHR4ozTM43k2fEWZy2JO
	 * -bv5785BZA5eO0VheI-kmApi3kTf1C5hS4tVlBiEdXdF4hIduQJCvQ
	 * 
	 * 7200
	 */
	private String access_token; // 获取到的凭证
	private int expires_in; // 凭证有效时间，单位：秒

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

}
