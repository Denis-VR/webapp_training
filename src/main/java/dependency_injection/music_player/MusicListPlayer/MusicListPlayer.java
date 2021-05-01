package dependency_injection.music_player.MusicListPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicListPlayer {
	private PopMusics popMusics;
	private RockMusics rockMusics;

	@Autowired
	public MusicListPlayer(PopMusics popMusics, RockMusics rockMusic) {
		this.popMusics = popMusics;
		this.rockMusics = rockMusic;
	}

	public void playMusic(MusicGenre genre) {
		int randomNumber = (int) (Math.random() * 3); //число от 0 до 2

		switch (genre) {
			case ROCK:
				System.out.println(rockMusics.getSong().get(randomNumber));
				break;
			case POP:
				System.out.println(popMusics.getSong().get(randomNumber));
				break;
		}
	}
}
