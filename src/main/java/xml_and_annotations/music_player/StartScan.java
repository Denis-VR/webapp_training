package xml_and_annotations.music_player;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml_and_annotations.music_player.source.Music;
import xml_and_annotations.music_player.source.MusicPlayer;

public class StartScan {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("annotationScan.xml");

		Music music = context.getBean("rockMusic", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();
//		System.out.println(music.getSong());

		context.close();
	}
}
