package dependency_injection.music_player.MusicPlayer;

import org.springframework.stereotype.Component;

@Component("popBean")
public class PopMusic implements Music {
	@Override
	public String getSong() {
		return "Some pop music";
	}
}
