package ex01;

public class Audio implements RemoteControl {

	int sum = 0;
	
	@Override
	public void turnOn() {
		System.out.println("스피커를 켭니다.");
	}
}
