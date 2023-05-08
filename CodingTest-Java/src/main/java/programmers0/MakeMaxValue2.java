package programmers0;

import java.util.Arrays;

public class MakeMaxValue2 {

	//프로그래머스 Level 0. 최댓값 만들기 (2)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120862
	public static void main(String[] args) {
		MakeMaxValue2 mmv = new MakeMaxValue2();
		
		int[] numbers1 = {1, 2, -3, 4, -5};
		System.out.println(mmv.solution(numbers1));
		
		int[] numbers2 = {0, -31, 24, 10, 1, 9};
		System.out.println(mmv.solution(numbers2));
		
		int[] numbers3 = {10, 20, 30, 5, 5, 20, 5};
		System.out.println(mmv.solution(numbers3));
	}

	private int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max((numbers[0]*numbers[1]), (numbers[numbers.length-1]*numbers[numbers.length-2]));
	}

}
