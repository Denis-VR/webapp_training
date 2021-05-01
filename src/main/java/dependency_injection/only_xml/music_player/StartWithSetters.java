package dependency_injection.only_xml.music_player;

import dependency_injection.only_xml.music_player.source.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithSetters {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"musicPlayer_setter.xml"
		);

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(musicPlayer == musicPlayer1);
		musicPlayer.playMusic();
		System.out.println(musicPlayer.getVolume());
		System.out.println(musicPlayer.getName());

		context.close();
	}
}
