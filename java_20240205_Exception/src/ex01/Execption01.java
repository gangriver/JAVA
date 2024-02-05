package ex01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Execption01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개 입력>>");
		double div = 0;
	try {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		div =num1 / num2;
		
		
		
	}catch(InputMismatchException e) {
		e.printStackTrace();
	}catch(ArithmeticException e) {
		e.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
//		여기는 예외가 발생하든 발생하지 않든 무조건 처리하는 구문
	}
		System.out.println("나누기 : " + div);
		System.out.println("프로그램 종료!");
	}
}
