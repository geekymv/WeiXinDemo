package org.geekymv.course.message.resp;

import org.geekymv.course.entity.Music;

/**
 * 回复音乐消息
 */
public class RespMusicMessage extends RespBaseMessage{
	
	private Music music;

	public Music getMusic() {
		return music;
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	
}
