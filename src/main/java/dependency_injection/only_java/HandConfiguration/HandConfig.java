package dependency_injection.only_java.HandConfiguration;

import dependency_injection.only_java.AutoConfig.PopMusic;
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
	public RockMusic rockBean() {
		return new RockMusic();
	}

	@Bean
	public MusicHandPlayer musicHandPlayer() {
		return new MusicHandPlayer(popBean());
	}
}
