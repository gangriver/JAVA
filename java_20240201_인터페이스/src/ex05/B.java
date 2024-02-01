package ex05;

public class B implements A {

	@Override
	public void method1() {
		System.out.println("B - method1()");
	}
}

class F implements A{

	@Override
	public void method1() {
		System.out.println("F-method");
		
	}
	
}