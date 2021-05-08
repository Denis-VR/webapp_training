package dependency_injection.only_java.Task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ListConfig.class);
		MusicListPlayer musicListPlayer = context.getBean("musicListPlayer", MusicListPlayer.class);
		musicListPlayer.playMusic();
		musicListPlayer.playMusic();
		musicListPlayer.playMusic();
	}
}
