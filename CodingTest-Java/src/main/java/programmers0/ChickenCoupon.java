package programmers0;

public class ChickenCoupon {

	//프로그래머스 Level 0. 치킨 쿠폰
	//https://school.programmers.co.kr/learn/courses/30/lessons/120884
	public static void main(String[] args) {
		ChickenCoupon cc = new ChickenCoupon();
		
		int chicken1 = 100;
		System.out.println(cc.solution(chicken1));
		
//		int chicken2 = 1081;
//		System.out.println(cc.solution(chicken2));
	}
	
	public int solution(int chicken) {
		int answer = 0;
		int coupon = chicken;
		int service = (int)(coupon/10);
		while(coupon + service > 10) {
			service = (int)(coupon/10);
			answer += service;
			coupon %= 10;
			coupon += service;
		}
		
		return answer;
	}

}
