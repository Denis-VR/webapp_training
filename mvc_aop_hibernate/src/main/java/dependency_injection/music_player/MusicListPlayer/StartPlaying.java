package dependency_injection.music_player.MusicListPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartPlaying {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationScan.xml");

		MusicListPlayer musicPlayer = context.getBean("musicListPlayer", MusicListPlayer.class);
		musicPlayer.playMusic(MusicGenre.ROCK);
		musicPlayer.playMusic(MusicGenre.POP);

		context.close();
	}
}
