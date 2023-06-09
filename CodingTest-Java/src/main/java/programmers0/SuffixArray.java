package programmers0;

import java.util.Arrays;

public class SuffixArray {

	//프로그래머스 Level 0. 접미사 배열
	//https://school.programmers.co.kr/learn/courses/30/lessons/181909
	public static void main(String[] args) {
		SuffixArray sa = new SuffixArray();
		
		String my_string1 = "banana";
		System.out.println(sa.solution(my_string1));
		
//		String my_string2 = "programmers";
//		System.out.println(sa.solution(my_string2));
	}

	private String[] solution(String my_string) {
		String[] answer = new String[my_string.length()];
		
		for (int i=0; i<my_string.length(); i++) {
			answer[i] = my_string.substring(my_string.length() - i - 1);
		}
		Arrays.sort(answer);
		
		return answer;
	}

}
