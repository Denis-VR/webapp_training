package dependency_injection.only_java.AutoConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("dependency_injection.only_java")
@PropertySource("classpath:musicPlayer.properties")
public class AutoConfig {
}
