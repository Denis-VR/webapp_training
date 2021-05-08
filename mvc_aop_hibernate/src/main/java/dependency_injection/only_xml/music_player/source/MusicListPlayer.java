package dependency_injection.only_xml.music_player.source;

import java.util.ArrayList;
import java.util.List;

public class MusicListPlayer {
	private List<Music> musics = new ArrayList<>();
	private List<String> names = new ArrayList<>();
	private int volume;

	public MusicListPlayer(List<Music> musics) {
		this.musics = musics;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	private MusicListPlayer() {
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void playMusic() {
		for (Music music :musics) {
			System.out.println("Playing: " + music.getSong());
		}
	}

	public void setListMusic(List<Music> musics) {
		this.musics = musics;
	}
}
