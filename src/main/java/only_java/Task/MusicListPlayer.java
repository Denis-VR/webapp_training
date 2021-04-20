package only_java.Task;

import only_java.HandConfiguration.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicListPlayer{
	private List<Music> musics;

	public MusicListPlayer(List<Music> musics) {
		this.musics = musics;
	}

	public String playMusic() {
		System.out.println("Playing: " + musics.get((int) (Math.random() * 3)).getSong());
		return "Playing: " + musics.get(0);
	}
}
