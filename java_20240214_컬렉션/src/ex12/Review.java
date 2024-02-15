package ex12;

import java.time.LocalDate;

public class Review  {

	int review; //리뷰 수
	LocalDate date;
	private int reviewCount;
	
	public Review(int reviewCount, LocalDate date) {
		this.reviewCount = reviewCount;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Review [reviewCount=" + reviewCount + ","
				+ "date=" + date + "]";
				
	}
	
	public int compareTo(Review o) {
		int x = this.reviewCount;
		int y = o.reviewCount;
		
		/*
		int result = 0;
		
		if(x > y)
			result = 1;
		else if (x < y)
			result = -1;
		else 
			result = 0;
		
		return result;
		*/
		
//		return (x>y)? -1 : ( (x<y) ? 1 : 0);
	return Integer.compare(y, x);
	}
}
