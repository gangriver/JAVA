package ex01;

interface Printable{
	void print(String msg);
}

class Printer implements Printable{

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}

}

public class Lamda3 {

	public static main(String[] args) {
		Printable prn = new Printer();

		prn.print("출력할 메시지.......");
	}
}