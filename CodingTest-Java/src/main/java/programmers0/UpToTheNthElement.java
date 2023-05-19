package programmers0;

import java.util.ArrayList;
import java.util.List;

public class UpToTheNthElement {

	//프로그래머스 Level 0. n 번째 원소까지
	//https://school.programmers.co.kr/learn/courses/30/lessons/181889
	public static void main(String[] args) {
		UpToTheNthElement nttne = new UpToTheNthElement();
		
		int[] num_list1 = {2, 1, 6};
		int n1 = 1;
		System.out.println(nttne.solution(num_list1, n1));
		
//		int[] num_list2 = {5, 2, 1, 7, 5};
//		int n2 = 3;
//		System.out.println(nttne.solution(num_list2, n2));
	}

	private List<Integer> solution(int[] num_list, int n) {
		List<Integer> answer = new ArrayList<>();
		for(int i=0; i<n; i++) {
			answer.add(num_list[i]);
		}
		
		return answer;
	}

}
