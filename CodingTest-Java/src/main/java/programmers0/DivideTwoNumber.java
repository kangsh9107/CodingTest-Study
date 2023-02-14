package programmers0;

public class DivideTwoNumber {

	//프로그래머스 Level 0. 두 수의 나눗셈
	//https://school.programmers.co.kr/learn/courses/30/lessons/120806
	public static void main(String[] args) {
		DivideTwoNumber dtn = new DivideTwoNumber();
		
		int num1 = 3;
		int num2 = 2;
		System.out.println(dtn.solution(num1, num2));
		
		int num3 = 7;
		int num4 = 3;
		System.out.println(dtn.solution(num3, num4));
		
		int num5 = 1;
		int num6 = 16;
		System.out.println(dtn.solution(num5, num6));
	}
	
	public int solution(int num1, int num2) {
		return (int)((double)num1/(double)num2*1000);
	}

}
