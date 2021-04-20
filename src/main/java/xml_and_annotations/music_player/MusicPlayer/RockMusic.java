package xml_and_annotations.music_player.MusicPlayer;

import org.springframework.stereotype.Component;

@Component("rockBean")
public class RockMusic implements Music {


	@Override
	public String getSong() {
		return "Wind cries Mary";
	}
}
