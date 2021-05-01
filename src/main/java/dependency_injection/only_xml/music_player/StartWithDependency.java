package dependency_injection.only_xml.music_player;

import dependency_injection.only_xml.music_player.source.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithDependency {
	public static class TestSpring {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"musicPlayer_constructor.xml"
			);

			MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
			musicPlayer.playMusic();

			context.close();
		}
	}
}
