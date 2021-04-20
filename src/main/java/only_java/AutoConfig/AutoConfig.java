package only_java.AutoConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("only_java")
@PropertySource("classpath:musicPlayer.properties")
public class AutoConfig {
}
