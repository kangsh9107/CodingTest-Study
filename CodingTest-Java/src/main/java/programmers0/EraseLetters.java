package programmers0;

import java.util.Arrays;

public class EraseLetters {

	//프로그래머스 Level 0. 글자 지우기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181900
	public static void main(String[] args) {
		EraseLetters el = new EraseLetters();
		
		String my_string1 = "apporoograpemmemprs";
		int[] indices1 = {1, 16, 6, 15, 0, 10, 11, 3};
		System.out.println(el.solution(my_string1, indices1));
	}

	private String solution(String my_string, int[] indices) {
		StringBuilder answer = new StringBuilder();
		String[] split = my_string.split("");
		boolean[] isSkip = new boolean[split.length];
		Arrays.sort(indices);
		for (int i=0; i<indices.length; i++) {
			isSkip[indices[i]] = true;
		}
		
		for (int i=0; i<split.length; i++) {
			if ( !isSkip[i] ) {
				answer.append(split[i]);
			}
		}
		
		return answer.toString();
	}

}
