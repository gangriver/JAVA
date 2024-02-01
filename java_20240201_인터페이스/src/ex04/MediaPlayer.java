package ex04;

public interface MediaPlayer {

	void play();
	void pause();
	void stop();
	
	default void loadfile(String file) {
		System.out.println(file + "로딩 중......");
	}
	

}