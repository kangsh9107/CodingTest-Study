package programmers0;

import java.util.ArrayList;
import java.util.List;

public class FindInteger {

	//프로그래머스 Level 0. 정수 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181840
	public static void main(String[] args) {
		FindInteger fi = new FindInteger();
		
		int[] num_list1 = {1, 2, 3, 4, 5};
		int n1 = 3;
		System.out.println(fi.solution(num_list1, n1));
		
//		int[] num_list2 = {15, 98, 23, 2, 15};
//		int n2 = 20;
//		System.out.println(fi.solution(num_list2, n2));
	}

	private int solution(int[] num_list, int n) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<num_list.length; i++) {
			list.add(num_list[i]);
		}
		return list.contains(n) ? 1 : 0;
	}

}
