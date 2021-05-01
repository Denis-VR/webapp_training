package dependency_injection.only_xml.music_player.source;

public class PopMusic implements Music{
	@Override
	public String getSong() {
		return "Some pop music";
	}
}
