package programmers0;

import java.util.ArrayList;
import java.util.List;

public class CutList {

	//프로그래머스 Level 0. 리스트 자르기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181897
	public static void main(String[] args) {
		CutList cl = new CutList();

		int n1 = 3;
		int[] slicer1 = {1, 5, 2};
		int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(cl.solution(n1, slicer1, num_list1));
		
//		int n2 = 4;
//		int[] slicer2 = {1, 5, 2};
//		int[] num_list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		System.out.println(cl.solution(n2, slicer2, num_list2));
	}
	
	private List<Integer> solution(int n, int[] slicer, int[] num_list) {
		List<Integer> answer = new ArrayList<>();
		int a = slicer[0];
		int b = slicer[1];
		int c = slicer[2];
		
		switch (n) {
		case 1:
			for (int i=0; i<=b; i++) {
				answer.add(num_list[i]);
			}
			break;
		case 2:
			for (int i=a; i<num_list.length; i++) {
				answer.add(num_list[i]);
			}
			break;
		case 3:
			for (int i=a; i<=b; i++) {
				answer.add(num_list[i]);
			}
			break;
		case 4:
			for (int i=a; i<=b; i+=c) {
				if (i < num_list.length) {
					answer.add(num_list[i]);
				}
			}
			break;
		}
		
		return answer;
	}
		
}
