package programmers0;

public class DiceGame1 {

	//프로그래머스 Level 0. 주사위 게임 1
	//https://school.programmers.co.kr/learn/courses/30/lessons/181839
	public static void main(String[] args) {
		DiceGame1 dg = new DiceGame1();
		
		int a1 = 3;
		int b1 = 5;
		System.out.println(dg.solution(a1, b1));
		
//		int a3 = 3;
//		int b4 = 5;
//		System.out.println(dg.solution(a3, b4));
//		
//		int a5 = 3;
//		int b6 = 5;
//		System.out.println(dg.solution(a5, b6));
	}

	private int solution(int a, int b) {
		int answer = 0;
		
		if(a % 2 != 0 && b % 2 != 0) answer = (a * a) + (b * b);
		else if(a % 2 != 0 || b % 2 != 0) answer = 2 * (a + b);
		else answer = Math.abs(a - b);
		
		return answer;
	}

}
