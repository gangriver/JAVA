package ex01;

/*
 * 메소드 : max
 * 매개변수 : 없음
 * 반환타입 : void
 * 기능 : 두 수 입력받아서 최대값 반환
 */

public class 반환없고매개변수없음 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("최대값 출력");
		
		max(); //호출
		
		System.out.println("프로그램 종료");
	}
	static void max() {
		
		int num1 = 5;
		int num2 = 25;
		
		int max = num1 > num2? num1 : num2;
		
		System.out.println("최대값 : " + max);
	}

}
