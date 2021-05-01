package dependency_injection.only_java;

import dependency_injection.only_java.HandConfiguration.HandConfig;
import dependency_injection.only_java.HandConfiguration.MusicHandPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartHandProgram {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HandConfig.class);

		MusicHandPlayer musicHandPlayer = context.getBean("musicHandPlayer", MusicHandPlayer.class);
		musicHandPlayer.playMusic();
		System.out.println(musicHandPlayer.getVolume());
		System.out.println(musicHandPlayer.getName());
	}
}
