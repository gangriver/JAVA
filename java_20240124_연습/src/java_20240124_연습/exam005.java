package java_20240124_연습;

import java.util.Scanner;

public class exam005 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		while(x<10) {
			while(y<=x) {
				System.out.print("*");
				y++;
			}
			System.out.println();
			y=1;
			x++;
		}
	}
}