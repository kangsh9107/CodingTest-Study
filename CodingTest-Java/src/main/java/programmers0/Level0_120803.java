package programmers0;

public class Level0_120803 {

	//프로그래머스 Level 0. 두 수의 차
	//https://school.programmers.co.kr/learn/courses/30/lessons/120803
	public static void main(String[] args) {
		Level0_120803 l120803 = new Level0_120803();
		
		int num1 = 2;
		int num2 = 3;
		System.out.println(l120803.solution(num1, num2));
		
		int num3 = 100;
		int num4 = 2;
		System.out.println(l120803.solution(num3, num4));
	}
	
    public int solution(int num1, int num2) {
		return num1 - num2;
    }

}
