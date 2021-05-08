package dependency_injection.only_xml.music_player;

import dependency_injection.only_xml.music_player.source.MusicListPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StartListMusic {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("musicListPlayer.xml");

		MusicListPlayer musicPlayer = context.getBean("musicListPlayer", MusicListPlayer.class);
		musicPlayer.playMusic();
		List<String> list = musicPlayer.getNames();
		for (String s :list) {
			System.out.println(s);
		}


		context.close();
	}
}
