package programmers0;

import java.util.Arrays;

public class RankFromTheBack {

	//프로그래머스 Level 0. 뒤에서 5등 위로
	//https://school.programmers.co.kr/learn/courses/30/lessons/181852
	public static void main(String[] args) {
		RankFromTheBack rftb = new RankFromTheBack();
		
		int[] num_list1 = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		System.out.println(rftb.solution(num_list1));
	}

	private int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        for(int i=0; i<answer.length; i++) {
            answer[i] = num_list[i + 5];
        }
        return answer;
	}

}
