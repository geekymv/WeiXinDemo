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
	private String token; // 获取到的凭证
	private int expiresIn; // 凭证有效时间，单位：秒
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	
}
