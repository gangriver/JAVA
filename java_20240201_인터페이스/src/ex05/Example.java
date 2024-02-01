package ex05;

public class Example {
	public static void action(A a) {
		a.method1();
		
		//a참조변수가 참조하는 대상이 C클래스 이거나 C클래스를 상속한 클래스이면 true반환
		// instanceof = 뒤에 오는 값이거나 상속하는 객체이냐 묻는 것
		if (a instanceof C) {
			C c =new C();
			c.method2();
		}
	}
	
	public static void main(String[] args) {
//		action(new B());
//		action(new C());
		action(new F());
	}
}
