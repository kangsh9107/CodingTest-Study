package programmers0;

import java.util.ArrayList;
import java.util.List;

public class ChangeOrder {

	//프로그래머스 Level 0. 순서 바꾸기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181891
	public static void main(String[] args) {
		ChangeOrder co = new ChangeOrder();
		
		int[] num_list1 = {2, 1, 6};
		int n1 = 1;
		System.out.println(co.solution(num_list1, n1));
		
		int[] num_list2 = {5, 2, 1, 7, 5};
		int n2 = 3;
		System.out.println(co.solution(num_list2, n2));
	}

	private List<Integer> solution(int[] num_list, int n) {
		List<Integer> answer = new ArrayList<>();
		for (int i=n; i<num_list.length; i++) {
			answer.add(num_list[i]);
		}
		for (int i=0; i<n; i++) {
			answer.add(num_list[i]);
		}
		
		return answer;
	}

}
