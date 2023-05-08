package programmers0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlyOnceAppearNumber {

	//프로그래머스 Level 0. 한 번만 등장한 문자
	//https://school.programmers.co.kr/learn/courses/30/lessons/120896
	public static void main(String[] args) {
		OnlyOnceAppearNumber ooan = new OnlyOnceAppearNumber();
		
		String s1 = "abcabcadc";
		System.out.println(ooan.solution(s1));
		
		String s2 = "abdc";
		System.out.println(ooan.solution(s2));
		
		String s3 = "hello";
		System.out.println(ooan.solution(s3));
	}

	private String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> hm = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[] splitS = s.split("");
        for(String ss : splitS) {
            if(hm.get(ss) == null) hm.put(ss, 1);
            else hm.put(ss, hm.get(ss)+1);
        }
        for(String key : hm.keySet()) {
            if(hm.get(key) == 1) list.add(key);
        }
        Collections.sort(list);
        for(String l : list) {
            answer.append(l);
        }
        return answer.toString();
	}

}
