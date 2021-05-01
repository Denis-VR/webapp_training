package dependency_injection.only_java.AutoConfig;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public interface Music {
	//init и destroy методы
	@PostConstruct
	default void doMyInit() {
		System.out.println("Doing my initialization!");
	}
	@PreDestroy
	default void doMyDestroy() {
		System.out.println("Doing my destruction");
	}

	String getSong();
}
