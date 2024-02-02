package ex05;

public class main {
	public static void main(String[] args) {
		
		int [] Arr = new int[3];
		
		try {
			for(int j=0; j < 4; j++) {
				Arr[j] = j;
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception!!!");
		}
	}
}
