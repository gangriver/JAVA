package ex03;

class A {
	void funA() {
		System.out.println("funA");
	}
	void funD() {
		System.out.println("A-funD");
	}
}

class B extends A {
	void funB() {
		System.out.println("funB");
	}
	void funD() {
		System.out.println("B-funD");
	}
}

class C extends B {
	void funC() {
		System.out.println("funC");
	}
	void funD() {
		System.out.println("C-funD");
	}
}

public class Exam01 {
	// a객체, B객체, C객체 가능
	static void testFunc(A a) {
		// funcA, funcB, funcC를 출력하려면 어떻게 해야할것인가?

		if (a instanceof C)
			((C) a).funC();
//				C c = (C)a;
//				c.funC();
		else if (a instanceof B)
			((B) a).funB();
		else
			a.funA();
		
		a.funD();
		System.out.println("------------------"
				+ ".");
	}

	public static void main(String[] args) {

		// 상위클래스는 하위 클래스 참조가능
		// 하위클래스는 상위 클래스 참조불가
		
		// 상위클래스는 하위클래스 자원 접근 불가
		// 하위클래스는 상위클래스 자원 접근 가능
		// 단, 하위클래스가 상위클래스 자원(메소드)을 재정의하면 그 때는 가능
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		a1.funD();
		a2.funD();
		a3.funD();

//		B b1 = new A(); 하위클래스는 상위클래스 참조불가 ==> 왜?  
		B b2 = new B();
		B b3 = new C();

//		C c1 = new A();  불가
//		C c2 = new B();  불가
		C c3 = new C();

		// 강제 타입 변환
		A aa1 = new B();
//		B bb1 = aa1; 불가 이유는?
		B bb2 = (B) aa1; // 가능 이유는?

		A aa2 = new C();

		C cc1 = (C) aa2; // 가능 이유는?

		System.out.println("----------------------1차 여기까지");

		testFunc(new A());
		testFunc(new B());
		testFunc(new C());

	}

}
