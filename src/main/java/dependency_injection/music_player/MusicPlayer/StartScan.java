package dependency_injection.music_player.MusicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartScan {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("annotationScan.xml");

		Music music = context.getBean("rockBean", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();
//		System.out.println(music.getSong());

		context.close();
	}
}
