package xml_and_annotations.music_player.source;

import org.springframework.stereotype.Component;

//@Component("classicBean")
public class ClassicalMusic implements Music {
	@Override
	public String getSong() {
		return "Moonlight Sonata";
	}
}
