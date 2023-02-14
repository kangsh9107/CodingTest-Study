package programmers0;

public class MinusTwoNumber {

	//프로그래머스 Level 0. 두 수의 차
	//https://school.programmers.co.kr/learn/courses/30/lessons/120803
	public static void main(String[] args) {
		MinusTwoNumber mtn = new MinusTwoNumber();
		
		int num1 = 2;
		int num2 = 3;
		System.out.println(mtn.solution(num1, num2));
		
		int num3 = 100;
		int num4 = 2;
		System.out.println(mtn.solution(num3, num4));
	}
	
	public int solution(int num1, int num2) {
		return num1 - num2;
	}

}
