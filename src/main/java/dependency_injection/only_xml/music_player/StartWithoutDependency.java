package dependency_injection.only_xml.music_player;

import dependency_injection.only_xml.music_player.source.Music;
import dependency_injection.only_xml.music_player.source.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithoutDependency {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"musicPlayer_constructor.xml"
		);

		Music music = context.getBean("musicBean", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();

		context.close();
	}

}
