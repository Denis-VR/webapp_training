package configuration_train.music_player.MusicPlayer;

import org.springframework.stereotype.Component;

@Component("popBean")
public class PopMusic implements Music {
	@Override
	public String getSong() {
		return "Some pop music";
	}
}