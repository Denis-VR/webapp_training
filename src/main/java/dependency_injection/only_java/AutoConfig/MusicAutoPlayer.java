package dependency_injection.only_java.AutoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MusicAutoPlayer {

	//	@Autowired
//	@Qualifier("classicBean")
	private Music music;
	@Value("Cool Player")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;

	@Autowired
	public MusicAutoPlayer(@Qualifier("rockBean") Music music) {
		this.music = music;
	}

	private MusicAutoPlayer() {
	}

	public static MusicAutoPlayer factoryMethod() {
		return new MusicAutoPlayer();
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
