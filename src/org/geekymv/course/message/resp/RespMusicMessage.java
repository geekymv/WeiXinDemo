package org.geekymv.course.message.resp;

import org.geekymv.course.entity.Music;

/**
 * »Ø¸´ÒôÀÖÏûÏ¢
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
