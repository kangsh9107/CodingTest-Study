package programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPassword {

	//프로그래머스 Level 1. 둘만의 암호
	//https://school.programmers.co.kr/learn/courses/30/lessons/155652
	public static void main(String[] args) {
		TwoPassword tp = new TwoPassword();
		
		String s1 = "aukks";
		String skip1 = "wbqd";
		int index1 = 5;
		System.out.println(tp.solution(s1, skip1, index1));
	}
	
	public String solution(String s, String skip, int index) {
		StringBuilder answer = new StringBuilder();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		List<String> skiped = new ArrayList<>(Arrays.asList(alphabet.split("")));
		for(int i=0; i<skip.length(); i++) {
			skiped.remove(skip.substring(i, i + 1));
		}
		
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<skiped.size(); j++) {
				if(s.substring(i, i + 1).equals(skiped.get(j))) {
					answer.append(skiped.get((j + index) % skiped.size()));
				}
			}
		}
		
		return answer.toString();
	}

}
