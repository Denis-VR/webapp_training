package only_java;

import org.springframework.stereotype.Component;

@Component("popBean")
public class PopMusic implements Music {
	@Override
	public String getSong() {
		return "Some pop music";
	}
}
