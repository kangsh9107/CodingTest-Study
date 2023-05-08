package programmers0;

import java.util.Arrays;

public class ConditionOfTriangle1 {

	//프로그래머스 Level 0. 삼각형의 완성조건 (1)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120889
	public static void main(String[] args) {
		ConditionOfTriangle1 cot = new ConditionOfTriangle1();
		
		int[] sides1 = {1, 2, 3};
		System.out.println(cot.solution(sides1));
		
		int[] sides2 = {3, 6, 2};
		System.out.println(cot.solution(sides2));
		
		int[] sides3 = {199, 72, 222};
		System.out.println(cot.solution(sides3));
	}

	private int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[2] < sides[0]+sides[1]) return 1;
        else return 2;
	}

}
