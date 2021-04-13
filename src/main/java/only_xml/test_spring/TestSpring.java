package only_xml.test_spring;

import only_xml.music_player.ClassicalMusic;
import only_xml.music_player.Music;
import only_xml.music_player.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"music_player.xml"
		);

		Music music = context.getBean("musicBean", ClassicalMusic.class);
		System.out.println(music.getSong());

		MusicPlayer musicPlayer = new MusicPlayer(music);
		System.out.println();

		context.close();
	}
}
