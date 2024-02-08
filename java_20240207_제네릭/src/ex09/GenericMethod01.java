package ex09;

class Box<T> {
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}


class unBoxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
}

public class GenericMethod01 {
	public static void main(String[] args) {
		

	}
}


