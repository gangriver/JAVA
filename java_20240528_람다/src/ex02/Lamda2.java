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

public class Lamda2 {

	public static main(String[] args) {
		
		Printable prn = new Printable() {

			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};

		prn.print("출력할 메시지......");
	}
}