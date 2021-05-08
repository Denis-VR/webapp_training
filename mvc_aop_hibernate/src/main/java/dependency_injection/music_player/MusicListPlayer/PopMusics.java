package dependency_injection.music_player.MusicListPlayer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PopMusics implements Musics{
	ArrayList<String> musicList = new ArrayList<>();

	{
		musicList.add("PopSong_1");
		musicList.add("PopSong_2");
		musicList.add("PopSong_3");
	}

	@Override
	public ArrayList<String> getSong() {
		return musicList;
	}
}
