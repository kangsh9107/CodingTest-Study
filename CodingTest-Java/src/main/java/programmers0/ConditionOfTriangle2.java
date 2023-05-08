package programmers0;

import java.util.Arrays;

public class ConditionOfTriangle2 {

	//프로그래머스 Level 0. 삼각형의 완성조건 (2)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120868
	public static void main(String[] args) {
		ConditionOfTriangle2 cot = new ConditionOfTriangle2();
		
		int[] sides1 = {1, 2};
		System.out.println(cot.solution(sides1));
		
		int[] sides2 = {3, 6};
		System.out.println(cot.solution(sides2));
		
		int[] sides3 = {11, 7};
		System.out.println(cot.solution(sides3));
	}

	private int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int side1 = sides[0];
        int side2 = sides[1];
        int side3 = sides[0] + sides[1] - 1;
        answer += side3 - side2;
        for(int i=side2; i>=(side2-side1+1); i--) {
            answer++;
        }
        
        return answer;
	}

}
