package programmers0;

import java.util.ArrayList;
import java.util.List;

public class ElementsInNInterval {

	//프로그래머스 Level 0. n개 간격의 원소들
	//https://school.programmers.co.kr/learn/courses/30/lessons/181888
	public static void main(String[] args) {
		ElementsInNInterval eini = new ElementsInNInterval();
		
		int[] num_list1 = {4, 2, 6, 1, 7, 6};
		int n1 = 2;
		System.out.println(eini.solution(num_list1, n1));
		
//		int[] num_list2 = {4, 2, 6, 1, 7, 6};
//		int n2 = 4;
//		System.out.println(eini.solution(num_list2, n2));
	}

	private List<Integer> solution(int[] num_list, int n) {
		List<Integer> answer = new ArrayList<>();
		for(int i=0; i<num_list.length; i+=n) {
			answer.add(num_list[i]);
		}
		
		return answer;
	}

}
