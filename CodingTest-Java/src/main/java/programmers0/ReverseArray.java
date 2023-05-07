package programmers0;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

	//프로그래머스 Level 0. 배열 뒤집기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120821
	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		
		int[] num_list1 = {1, 2, 3, 4, 5};
		System.out.println(ra.solution(num_list1));
		
		int[] num_list2 = {1, 1, 1, 1, 1, 2};
		System.out.println(ra.solution(num_list2));
		
		int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};
		System.out.println(ra.solution(num_list3));
	}

	private List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        for(int i=num_list.length-1; i>=0; i--) {
            answer.add(num_list[i]);
        }
        return answer;
	}

}
