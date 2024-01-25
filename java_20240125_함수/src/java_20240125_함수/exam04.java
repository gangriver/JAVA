package java_20240125_함수;

/*
 * 메서드: calculateEvenSum
 * 매개변수: int
 * 반환타입: int
 * 기능: 주어진 정수 N까지의 모든 짝수의 합을 계산하는 함수를 작성
 */
public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(10,20));
		
		System.out.println(add(10.2,20.2));
	
		System.out.println(add(10,20,30));
	}
	
	static int add(int i, int j) {
		return i+j;
	}
	//매개변수가 다르면 메서드는 같은것이 올 수 있음
	static double add(double i, double j) {
		return i+j;
	}
	static double add(int i, int j, int k) {
		return i+j+k;
	}
	}


