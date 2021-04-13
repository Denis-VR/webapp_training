package only_xml.music_player;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import only_xml.test_spring.TestBean;

public class StartProgram {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"music_player.xml"
		);

		Music music = context.getBean("musicBean", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();

		context.close();
	}
}
