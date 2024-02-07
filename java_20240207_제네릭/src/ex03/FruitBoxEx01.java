package ex03;

/*
 * 이 코드 문제점(?)
 * 1. 이 박스에는 사과,오렌지만 담고싶은데 다른것이 담겨도 제거 불가
 * 2. get할 때 형변환 해야한다 (다운케스팅을 해야함)
 */



class Apple{	//사과
	public String toString() {
		return "I am an apple";
	}
}

class Orange{	//오렌지
	public String toString() {
		return "I am an Orange";
	}
}

class Box<T>{	//사과, 오렌지 담는 상자
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
}



public class FruitBoxEx01 {
	public static void main(String[] args) {
		
		Box<Apple> abox = new Box<Apple>();
		Box<Orange> bbox = new Box();
		
		abox.setObj(new Apple());	//사과 담음
		bbox.setObj(new Orange());	//오렌지 담음
		
		Apple ap = abox.getObj();
		Orange op = bbox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
//		abox.setObj(10);
//		abox.setObj(1.2);
//		abox.setObj("String");
		
		Box<Integer> cbox = new Box();
		cbox.setObj(100);
	}
}
		
//		Box a = new Box();
//		
//		a.setObj(new Apple());
//		a.setObj(new Orange());
//		
//		Apple a1 = (Apple)a.getObj();
//		Orange a2 = (Orange)a.getObj();
	

























