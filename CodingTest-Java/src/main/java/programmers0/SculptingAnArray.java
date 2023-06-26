package programmers0;

import java.util.ArrayList;
import java.util.List;

public class SculptingAnArray {

	/*
	 * 프로그래머스 Level 0. 배열 조각하기
	 * https://school.programmers.co.kr/learn/courses/30/lessons/181893
	 *
	 * 생성일 : 2023-06-26
	 * 완료일 : 2023-06-26
	 */
	public static void main(String[] args) {
		SculptingAnArray saa = new SculptingAnArray();
		
		int[] arr1 = {0, 1, 2, 3, 4, 5};
		int[] query1 = {4, 1, 2};
		System.out.println(saa.solution(arr1, query1));
	}

	private List<Integer> solution(int[] arr, int[] query) {
		List<Integer> answer = new ArrayList<>();

		for (int i=0; i<arr.length; i++) {
			answer.add(arr[i]);
		}

		for (int i=0; i<query.length; i++) {
			if (i % 2 == 0) {
				while (answer.size() > query[i] + 1) {
					answer.remove(answer.size() - 1);
				}
			} else {
				for (int j=0; j<query[i]; j++) {
					answer.remove(0);
				}
			}
		}

		return answer;
	}

}
