package programmers0;

import java.util.ArrayList;
import java.util.List;

public class ConvertingSequencesAccordingToConditions2 {

	//프로그래머스 Level 0. 조건에 맞게 수열 변환하기 2
	//https://school.programmers.co.kr/learn/courses/30/lessons/181881
	public static void main(String[] args) {
		ConvertingSequencesAccordingToConditions2 csatc = new ConvertingSequencesAccordingToConditions2();
		
		int[] arr1 = {1, 2, 3, 100, 99, 98};
		System.out.println(csatc.solution(arr1));
	}

	private int solution(int[] arr) {
		int answer = 0;
		List<Integer> listA = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			listA.add(arr[i]);
		}
		
		while(true) {
			List<Integer> listB = new ArrayList<>();
			for(int i=0; i<arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) {
					listB.add(arr[i] /= 2);
				} else if (arr[i] < 50 && arr[i] % 2 != 0) {
					listB.add(arr[i] *= 2 + 1);
				}
			}
			
			if (listA.containsAll(listB)) break;
			answer++;
		}
		
		return answer;
	}

}
