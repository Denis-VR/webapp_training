package configuration_train.music_player.MusicPlayer;

import org.springframework.stereotype.Component;

@Component("classicBean")
public class ClassicalMusic implements Music {
	@Override
	public String getSong() {
		return "Moonlight Sonata";
	}
}
