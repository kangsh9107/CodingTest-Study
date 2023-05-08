package programmers0;

import java.util.Arrays;

public class MakeMaxValue1 {

	//프로그래머스 Level 0. 최댓값 만들기(1)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120847
	public static void main(String[] args) {
		MakeMaxValue1 mmv = new MakeMaxValue1();
		
		int[] numbers1 = {1, 2, 3, 4, 5};
		System.out.println(mmv.solution(numbers1));
		
//		int[] numbers2 = {0, 31, 24, 10, 1, 9};
//		System.out.println(mmv.solution(numbers2));
	}

	private int solution(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[numbers.length-1] * numbers[numbers.length-2];
	}

}
