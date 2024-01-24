package java_20240124_연습;

public class exam011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coinUnit = {500, 100, 50, 10} ;
		int money = 2680;
		System.out.println("money=" + money);
		for(int i = 0; i<coinUnit.length; i++) {
			int count = 0;
			count = money/coinUnit[i];
			money %= coinUnit[i];
			System.out.println(coinUnit[i] + "원 : " + count);
		}
		
	}

}
