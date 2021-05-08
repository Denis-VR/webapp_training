package dependency_injection.music_player.MusicPlayer;

import org.springframework.stereotype.Component;

@Component("rockBean")
public class RockMusic implements Music {


	@Override
	public String getSong() {
		return "Wind cries Mary";
	}
}
