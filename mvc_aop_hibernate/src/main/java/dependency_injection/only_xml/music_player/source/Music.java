package dependency_injection.only_xml.music_player.source;

public interface Music {
	//init и destroy методы
	default void doMyInit() {
		System.out.println("Doing my initialization!");
	}
	default void doMyDestroy() {
		System.out.println("Doing my destruction");
	}

	String getSong();
}
