package only_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		System.out.println(musicPlayer.getVolume());
		System.out.println(musicPlayer.getName());
	}
}
