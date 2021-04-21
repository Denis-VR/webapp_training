package configuration_train.only_java.Task;

import configuration_train.only_java.HandConfiguration.Music;
import configuration_train.only_java.HandConfiguration.PopMusic;
import configuration_train.only_java.HandConfiguration.RockMusic;
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