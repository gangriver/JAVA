package java_20240124_연습;

public class exam004 {

	public static void main(String[] args) {
int posNumber;
int nagNumber;

int result;


posNumber = 0;
nagNumber = 0;
	for(int i= 1; i < 20; i+= 2) {
		nagNumber += i;
	}
	result = nagNumber - posNumber;
	
	System.out.println(result);
}

}