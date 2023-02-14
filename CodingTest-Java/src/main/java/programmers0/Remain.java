package programmers0;

public class Remain {

	//프로그래머스 Level 0. 나머지 구하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120810
	public static void main(String[] args) {
		Remain rm = new Remain();
		
		int num1 = 3;
		int num2 = 2;
		System.out.println(rm.solution(num1, num2));
		
		int num3 = 10;
		int num4 = 5;
		System.out.println(rm.solution(num3, num4));
	}
	
	public int solution(int num1, int num2) {
		int answer = num1 % num2;
		return answer;
	}

}
