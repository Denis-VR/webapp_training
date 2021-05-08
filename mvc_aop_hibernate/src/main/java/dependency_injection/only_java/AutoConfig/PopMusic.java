package dependency_injection.only_java.AutoConfig;

import org.springframework.stereotype.Component;

@Component("popBean")
public class PopMusic implements Music {
	@Override
	public String getSong() {
		return "Some pop music";
	}
}
