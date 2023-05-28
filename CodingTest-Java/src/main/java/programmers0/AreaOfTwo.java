package programmers0;

import java.util.ArrayList;
import java.util.List;

public class AreaOfTwo {

	//프로그래머스 Level 0. 2의 영역
	//https://school.programmers.co.kr/learn/courses/30/lessons/181894
	public static void main(String[] args) {
		AreaOfTwo aot = new AreaOfTwo();
		
//		int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
//		System.out.println(aot.solution(arr1));
		
		int[] arr2 = {1, 2, 1};
		System.out.println(aot.solution(arr2));
		
//		int[] arr3 = {1, 1, 1};
//		System.out.println(aot.solution(arr3));
//		
//		int[] arr4 = {1, 2, 1, 2, 1, 10, 2, 1};
//		System.out.println(aot.solution(arr4));
	}

	private List<Integer> solution(int[] arr) {
		int firstIdx = -1;
		int lastIdx = -1;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == 2 && firstIdx == -1) {
				firstIdx = i;
			} else if (arr[i] == 2) {
				lastIdx = i;
			}
		}
		
		List<Integer> answer = new ArrayList<>();
		if ( firstIdx == -1 && lastIdx == -1) {
			answer.add(-1);
		} else if (lastIdx == -1) {
			answer.add(arr[firstIdx]);
		} else {
			for (int i=firstIdx; i<=lastIdx; i++) {
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}

}
