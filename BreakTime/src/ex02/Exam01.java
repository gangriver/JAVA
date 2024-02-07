package ex02;

class A {
	void funcA() {
		System.out.println("funcA");
	}
}

class B extends A{
	void funcB() {
		System.out.println("funcB");
	}
}

class C extends B{
	void funcC() {
		System.out.println("funcC");
	}
}



public class Exam01 {
	// a객체, B객체, C객체 가능
			static void testFunc(A a) {
				//funcA, funcB, funcC를 출력하려면 어떻게 해야할것인가?
			}
	public static void main(String[] args) {
		
		
		
		//상위클래스는 하위 클래스 참조가능
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
//		B b1 = new A(); 하위클래스는 상위클래스 참조불가 ==> 왜?  
		B b2 = new B();
		B b3 = new C();
		
//		C c1 = new A();  불가
//		C c2 = new B();  불가
		C c3 = new C();
		
		//강제 타입 변환
		A aa1 = new B();
//		B bb1 = aa1; 불가 이유는?
		B bb2 = (B)aa1;	// 가능 이유는?
		
		A aa2 = new C();
		
		C cc1 = (C)aa2; // 가능 이유는?
		
		System.out.println("----------------------1차 여기까지");
	
		testFunc(new A());
		testFunc(new B());
		testFunc(new C());
	
	}
	
	
}








