package ex04;

public class Main {
	public static void main(String[] args) {
		MP3Player_Ver1 mp3_ver1 = new MP3Player_Ver1();
		mp3_ver1.Play();
		mp3_ver1.Stop();
		
		MP3Player_Ver2 mp3_ver2 = new MP3Player_Ver2();
		mp3_ver2.Play();
		mp3_ver2.Stop();
		mp3_ver2.Next();
		mp3_ver2.Prev();
	}
}
