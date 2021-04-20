package xml_and_annotations.music_player.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

	@Autowired
	private Music music;
	private String name;
	private int volume;

//	@Autowired
	public MusicPlayer(Music music) {
		this.music = music;
	}

	private MusicPlayer() {
	}

	public static MusicPlayer factoryMethod() {
		return new MusicPlayer();
	}

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}

	public void setMusic(Music music) {
		this.music = music;
	}
}
