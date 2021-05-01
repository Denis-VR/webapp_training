package dependency_injection.music_player.MusicListPlayer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusics implements Musics{
	ArrayList<String> musicList = new ArrayList<>();

	{
		musicList.add("RockSong_1");
		musicList.add("RockSong_2");
		musicList.add("RockSong_3");
	}

	@Override
	public ArrayList<String> getSong() {
		return musicList;
	}
}
