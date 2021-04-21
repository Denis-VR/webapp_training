package configuration_train.only_java;

import configuration_train.only_java.AutoConfig.AutoConfig;
import configuration_train.only_java.AutoConfig.MusicAutoPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartAutoProgram {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);

		MusicAutoPlayer musicPlayer = context.getBean("musicAutoPlayer", MusicAutoPlayer.class);
		musicPlayer.playMusic();
		System.out.println(musicPlayer.getVolume());
		System.out.println(musicPlayer.getName());
	}
}
