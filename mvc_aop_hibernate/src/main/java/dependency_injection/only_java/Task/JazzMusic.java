package dependency_injection.only_java.Task;

import dependency_injection.only_java.HandConfiguration.Music;

public class JazzMusic implements Music {
	@Override
	public String getSong() {
		return "Jazz Song";
	}
}
