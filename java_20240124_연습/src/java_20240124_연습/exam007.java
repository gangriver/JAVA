package java_20240124_연습;

import java.util.Scanner;

public class exam007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int i = (int)(Math.random()*100);
			
	int count = 0;
	while (true) {
		System.out.println("\n숫자를 입력하세요");
		System.out.print(" ");
		int win = sc.nextInt();
	count++;
	if (i == win) {
		System.out.printf("1과 100사이의 값을 입력하세요 : %d \n",win);
		System.out.printf("맞췄습니다. 시도 횟수는 %d 번입니다");
		return;
	}else if (i > win) {
		System.out.printf("1과 100사이의 값을 입력하세요 : %d \n",win);
		System.out.printf("더 큰 수를 입력하세요");
	}else if (i < win) {
		System.out.printf("1과 100사이의 값을 입력하세요 : %d \n",win);
		System.out.printf("더 작은 수를 입력하세요");
		}
	
	
	}
	
}
}