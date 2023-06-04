package programmers0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterCount {

	//프로그래머스 Level 0. 문자 개수 세기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181902
	public static void main(String[] args) {
		CharacterCount cc = new CharacterCount();
		
		String my_string1 = "Programmers";
		System.out.println(cc.solution(my_string1));
	}
	
	private int[] solution(String my_string) {
		int[] answer = new int[52];
        for (char my : my_string.toCharArray()) {
        	if (my >= 'a') {
        		answer[my - 'a' + 26]++;
        	} else {
        		answer[my - 'A']++;
        	}
        }

        return answer;
	}

//	private List<Integer> solution(String my_string) {
//		Map<String, Integer> hm = new HashMap<>();
//		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//		String[] split = alphabet.split("");
//		for (String s : split) {
//			hm.put(s, 0);
//		}
//		for (String my : my_string.split("")) {
//			hm.put(my, hm.get(my) + 1);
//		}
//		
//		List<Integer> answer = new ArrayList<>();
//		for (String key : hm.keySet()) {
//			answer.add(hm.get(key));
//		}
//		
//		return answer;
//	}

}
