package ex01;

@FunctionalInterface
interface Printable{
	void print(String msg);

	public static void print5() {};
	default void print2() {};
	default void print3() {};
	default void print4() {};
}

class A{
	
}

//람다를 만들 수 있는 대상은 함수형 인터페이스만 가능(인터페이스 안에 추상 메소드가 1개만 존재)
public class Lamda3 {

	public static main(String[] args) {
		
		// Printable prn = (msg) ->  System.out.println(msg);
		
		//메소드 참조
		Printable prn = System.out::println;
			
		

		prn.print("출력할 메시지......");
	}
}