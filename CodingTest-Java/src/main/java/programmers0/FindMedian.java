package programmers0;

import java.util.Arrays;

public class FindMedian {

	//프로그래머스 Level 0. 중앙값 구하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120811
	public static void main(String[] args) {
		FindMedian fm = new FindMedian();
		
		int[] array1 = {1, 2, 7, 10, 11};
		System.out.println(fm.solution(array1));
		
		int[] array2 = {9, -1, 0};
		System.out.println(fm.solution(array2));
	}

	private int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[(int)(array.length/2)];
        return answer;
	}

}
