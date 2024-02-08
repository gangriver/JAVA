package ex13;

class Box<T>{		
	
	private T obj;
	
	void set(T obj) { this.obj = obj; }
	T get() { return this.obj; }
	
	@Override
	public String toString() {
		return obj.toString();
	}
}

class Unboxer{
//	super Integer ==> Integer 이거나 Integer 상위클래스이면 OK
// 	Integer 계층도 : Interger -> Number -> Object
	public static void peekBox(Box<? super Integer> box) {//? 와일드카드
		System.out.println(box);
	}
}

class A {
	public String toString() {
		return "A class";
	}
}

public class GenericMethod01 {
	
	public static void main(String[] args) {
	
		Box<Integer> ibox = new Box();
		ibox.set(1234);
		Unboxer.peekBox(ibox);

		Box<Number> nbox = new Box<Number>();
		nbox.set(10.2);
		Unboxer.peekBox(nbox);
		
		Box<Object> obox = new Box<Object>();
		obox.set("설날");
		Unboxer.peekBox(obox);
		
		Box<Object> obox2 = new Box<Object>();
		obox2.set(new A());
		Unboxer.peekBox(obox2);
		
		
	}
}