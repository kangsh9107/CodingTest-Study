package programmers0;

import java.util.ArrayList;
import java.util.List;

public class SculptingAnArray {

	//프로그래머스 Level 0. 배열 조각하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181893
	public static void main(String[] args) {
		SculptingAnArray saa = new SculptingAnArray();
		
		int[] arr1 = {0, 1, 2, 3, 4, 5};
		int[] query1 = {4, 1, 2};
		System.out.println(saa.solution(arr1, query1));
	}

	private List<Integer> solution(int[] arr, int[] query) {
		int firstIdx = 0;
		int lastIdx = 0;
		
		for (int i=0; i<query.length; i++) {
			if (query[i] % 2 != 0) {
				firstIdx += query[i];
			} else {
				lastIdx = firstIdx + query[i];
			}
		}
		
		List<Integer> answer = new ArrayList<>();
		for (int i=firstIdx; i<=lastIdx; i++) {
			answer.add(arr[i]);
		}
		
		return answer;
	}

}
