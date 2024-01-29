package ex02;

import java.util.Scanner;

public class exalmple01 {

	public static void main(String[] args) {
				
		//cat이란 클래스를 통해서 c1이란 참조변수가 참조하는 객체를 생성함
		cat c1 = new cat("페르시안고양이","흰색" );
		//--> new cat()란 생성자 호출을 통해서 객체를 생성한다.

//		c1.breed = "페르시안고양이";
//		c1.color = "흰색";
		
		c1.eat();
		                //러시안블루
		cat c2 = new cat("코리아","검정색");
		
//		c2.breed = "코리아숏트헤어고양이";
//		c2.color = "검은색";
		
		c2.eat();
		
		c2.setBreed("러시안블루");
		c2.eat();
		
	}

}
