package dependency_injection.only_xml.music_player.source;

public class MusicPlayer {
	private Music music;
	private String name;
	private int volume;

	public MusicPlayer(Music music) {
		this.music = music;
	}

	private MusicPlayer() {
	}

	public static MusicPlayer factoryMethod() {
		return new MusicPlayer();
	}

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}

	public void setMusic(Music music) {
		this.music = music;
	}
}
