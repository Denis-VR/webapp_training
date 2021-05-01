package dependency_injection.music_player.MusicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartComputer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationScan.xml");
		Computer computer = context.getBean("computer", Computer.class);
		System.out.println(computer);
		System.out.println("Volume: " + context.getBean("musicPlayer", MusicPlayer.class).getVolume());
		System.out.println("Name: " + context.getBean("musicPlayer", MusicPlayer.class).getName());

		context.close();
	}
}
