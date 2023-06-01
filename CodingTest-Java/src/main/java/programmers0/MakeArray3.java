package programmers0;

import java.util.ArrayList;
import java.util.List;

public class MakeArray3 {

	//프로그래머스 Level 0. 배열 만들기 3
	//https://school.programmers.co.kr/learn/courses/30/lessons/181895
	public static void main(String[] args) {
		MakeArray3 ma = new MakeArray3();
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[][] intervals1 = {{1, 3}, {0, 4}};
		System.out.println(ma.solution(arr1, intervals1));
	}

	private List<Integer> solution(int[] arr, int[][] intervals) {
		List<Integer> answer = new ArrayList<>();
		
		for (int i=0; i<intervals.length; i++) {
			for (int j=intervals[i][0]; j<=intervals[i][1]; j++) {
				answer.add(arr[j]);
			}
		}
		
		return answer;
	}

}
