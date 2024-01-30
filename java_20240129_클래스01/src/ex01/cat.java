package ex01;

public class cat {

		//멤버 변수 --재료
		String breed;
		String color;
		int age;
		
		void setAge(int n) {
			if(n>0 && n<=150)
				age = n;
			else 
				age = 1;
		}
		//생성자(클래스이름하고 같음) --반환타입x
		cat() {
			
		}
		
		
		
		//void(반환타입) eat(함수명) ()(매개변수)
		//멤버 메소드 --액션
		void eat() {
			System.out.println("age");
			System.out.println("츄르를 먹는다");
			System.out.println("칼라는 " + color + "이다.");
		}

		void scratch() {
			
		}
		
		void meow() {
			
		}
}
