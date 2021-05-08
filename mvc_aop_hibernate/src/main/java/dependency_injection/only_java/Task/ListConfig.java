package dependency_injection.only_java.Task;

import dependency_injection.only_java.HandConfiguration.Music;
import dependency_injection.only_java.HandConfiguration.PopMusic;
import dependency_injection.only_java.HandConfiguration.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class ListConfig {

	@Bean
	public PopMusic popBean() {
		return new PopMusic();
	}

	@Bean
	public RockMusic rockBean() {
		return new RockMusic();
	}

	@Bean
	public JazzMusic jazzBean() {
		return new JazzMusic();
	}

	@Bean
	public List<Music> musicList() {
		return Arrays.asList(popBean(), rockBean(), jazzBean());
	}

	@Bean
	public MusicListPlayer musicListPlayer() {
		return new MusicListPlayer(musicList());
	}

}