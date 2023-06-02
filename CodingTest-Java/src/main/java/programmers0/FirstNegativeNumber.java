package programmers0;

import java.util.Arrays;

public class FirstNegativeNumber {

	//프로그래머스 Level 0. 첫 번째로 나오는 음수
	//https://school.programmers.co.kr/learn/courses/30/lessons/181896
	public static void main(String[] args) {
		FirstNegativeNumber fnn = new FirstNegativeNumber();
		
		int[] num_list1 = {12, 4, 15, 46, 38, -2, 15};
		System.out.println(fnn.solution(num_list1));
		
//		int[] num_list2 = {13, 22, 53, 24, 15, 6};
//		System.out.println(fnn.solution(num_list2));
	}

	private int solution(int[] num_list) {
		String str = Arrays.toString(num_list).replaceAll("[\\[\\],0-9]", "");
		int idx = str.indexOf("-");
		
		return idx;
	}

}
