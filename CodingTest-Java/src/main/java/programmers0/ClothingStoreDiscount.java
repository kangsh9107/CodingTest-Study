package programmers0;

public class ClothingStoreDiscount {

	//프로그래머스 Level 0. 옷가게 할인 받기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120818
	public static void main(String[] args) {
		ClothingStoreDiscount csd = new ClothingStoreDiscount();
		
		int price1 = 150000;
		System.out.println(csd.solution(price1));
		
		int price2 = 580000;
		System.out.println(csd.solution(price2));
	}

	private int solution(int price) {
        if(price >= 500000) price *= 0.8;
        else if(price >= 300000) price *= 0.9;
        else if(price >= 100000) price *= 0.95;
        return price;
	}

}
