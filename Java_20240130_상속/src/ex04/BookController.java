package ex04;
/*
 Book, EBook, AudioBook 세 클래스를 생성합니다.
각 클래스는 주어진 속성과 메서드를 가집니다.
EBook과 AudioBook 클래스는 Book 클래스로부터 상속받고, 추가 속성과 메서드를 가집니다.
 */

public class BookController {

	public static void main(String[] args) {
	
		Book book = new Book();
		book.displayInfo();
		
		EBook ebook = new EBook("스프링워크북","구멍가게",2023,10.2,"PDF");
		ebook.displayInfo();
		
		AudioBook audiobook = new AudioBook("스프링워크북","코딩",2024,3, "토레타");
		audiobook.displayInfo();
	}
}

