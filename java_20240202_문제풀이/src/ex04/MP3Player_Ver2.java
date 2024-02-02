package ex04;

public class MP3Player_Ver2 implements PlayFunction, StopFunction, NextFunction, PrevFunction {
	public void Play() {
		System.out.println("Play_Ver2!");
	}
	
	public void Stop() {
		System.out.println("Stop!_Ver2");
	}
	
	public void Next() {
		System.out.println("Next!_Ver2");
	}
	
	public void Prev() {
		System.out.println("Prev!_Ver2");
	}
}
