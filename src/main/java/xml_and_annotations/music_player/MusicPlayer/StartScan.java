package xml_and_annotations.music_player.MusicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml_and_annotations.music_player.MusicPlayer.Music;
import xml_and_annotations.music_player.MusicPlayer.MusicPlayer;

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
