package ex06;

public class for문문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0)
				sum += i;
		}
		System.out.println("총합 : " + sum);
		
		int[] arr = {10,20,30};
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		int[] numArr = arr;
		for(int i=0; i<arr.length; i++)
			numArr[i]  += 100;
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i] + " ");
		
//      for(int i=0; i<arr.length; i++)
//		System.out.println(arr[i] + " ");
		
		for(int n : arr)
			System.out.println(n + " ");
		
		String[] str = {"kor","eng","math","com","sci"};
//		for(String s : str)
//		System.out.println(s + " ");
		for(int i=0; i<str.length; i++)
			System.out.println(str[i] + " ");
		
		System.out.println();
		String s1 ="kor";
		String s2 ="kor";
		System.out.println(s1.equals(s2));
		
		String ju = "901011-1080413";
		String[] ju2 = ju.split("-");
		for(String j : ju2)
			System.out.println(j);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
