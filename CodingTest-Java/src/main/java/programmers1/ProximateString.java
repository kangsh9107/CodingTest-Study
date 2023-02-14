package programmers1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProximateString {

	//프로그래머스 Level 1. 가장 가까운 같은 글자
	//https://school.programmers.co.kr/learn/courses/30/lessons/142086
	public static void main(String[] args) {
		ProximateString ps = new ProximateString();
		
		String s1 = "banana";
		System.out.println(ps.solution(s1));
		
//		String s2 = "foobar";
//		System.out.println(ps.solution(s2));
	}
	
	public List<Integer> solution(String s) {
		Map<String, Integer> hm = new HashMap<>();
		List<Integer> answer = new ArrayList<>();
		String temp = "";
		for(int i=0; i<s.length(); i++) {
			temp = s.substring(i, i+1);
			if(hm.get(temp) == null) {
				hm.put(temp, i);
				answer.add(-1);
			} else {
				answer.add(i - hm.get(temp));
				hm.put(temp, i);
			}
		}
		return answer;
	}

}
