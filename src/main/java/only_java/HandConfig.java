package only_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class HandConfig {

	@Bean
	public PopMusic popBean() {
		return new PopMusic();
	}

	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(popBean());
	}
}
