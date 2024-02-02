package ex06;

import ex01.TV;

public class TvTest {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
//		Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}   //main의 끝
}

 
