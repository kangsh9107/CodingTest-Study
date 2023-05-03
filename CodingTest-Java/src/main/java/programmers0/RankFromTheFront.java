package programmers0;

import java.util.Arrays;

public class RankFromTheFront {

	//프로그래머스 Level 0. 뒤에서 5등까지
	//https://school.programmers.co.kr/learn/courses/30/lessons/181853
	public static void main(String[] args) {
		RankFromTheFront rftf = new RankFromTheFront();
		
		int[] num_list1 = {12, 4, 15, 46, 38, 1, 14};
		System.out.println(rftf.solution(num_list1));
	}

	private int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for(int i=0; i<answer.length; i++) {
            answer[i] = num_list[i];
        }
        return answer;
	}

}
