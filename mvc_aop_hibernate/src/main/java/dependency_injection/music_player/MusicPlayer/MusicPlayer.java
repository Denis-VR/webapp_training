package dependency_injection.music_player.MusicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MusicPlayer {

	//	@Autowired
//	@Qualifier("classicBean")
	private Music music;
	@Value("Cool Player")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;

	@Autowired
	public MusicPlayer(@Qualifier("rockBean") Music music) {
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

	public String playMusic() {
		System.out.println("Playing: " + music.getSong());
		return "Playing: " + music.getSong();
	}

	public void setMusic(Music music) {
		this.music = music;
	}
}
