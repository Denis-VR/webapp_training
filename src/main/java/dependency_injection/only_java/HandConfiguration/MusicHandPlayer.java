package dependency_injection.only_java.HandConfiguration;

import dependency_injection.only_java.AutoConfig.Music;
import org.springframework.beans.factory.annotation.Value;

public class MusicHandPlayer {

	private Music music;
	@Value("Cool Player")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;

	public MusicHandPlayer(Music music) {
		this.music = music;
	}

	private MusicHandPlayer() {
	}

	public static MusicHandPlayer factoryMethod() {
		return new MusicHandPlayer();
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

	public String playMusic() {
		System.out.println("Playing: " + music.getSong());
		return "Playing: " + music.getSong();
	}

	public void setMusic(Music music) {
		this.music = music;
	}
}
