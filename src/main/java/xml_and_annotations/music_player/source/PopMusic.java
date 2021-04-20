package xml_and_annotations.music_player.source;

import org.springframework.stereotype.Component;

//@Component("popBean")
public class PopMusic implements Music {
	@Override
	public String getSong() {
		return "Some pop music";
	}
}
