package ex01;


class Outer{
	private static int num = 0; //정보은닉

	private int age = 10;
	static class Nested1{	//정적중첩클래스
		void add(int n) {num +=n;}	 
	}
	static class Nested2{
		int get() {return num;}
	}
}

public class StaticNested {

	public static void main(String[] args) {

		Outer.Nested1 nest1 = new Outer.Nested1();
		nest1.add(5);

		Outer.Nested2 nest2 = new Outer.Nested2();

		System.out.println(nest2.get());
		
		Outer outer = new Outer();
		outer.getAge();
		// System.out.println(new Outer().getAge());
	}
}