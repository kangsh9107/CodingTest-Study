package programmers0;

import java.util.HashMap;
import java.util.Map;

public class AtoB {

	//프로그래머스 Level 0. A로 B 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120886
	public static void main(String[] args) {
		AtoB ab = new AtoB();
		
		String before1 = "olleh";
		String after1 = "hello";
		System.out.println(ab.solution(before1, after1));
		
//		String before2 = "allpe";
//		String after2 = "apple";
//		System.out.println(ab.solution(before2, after2));
	}

    public int solution(String before, String after) {
        int answer = 0;
        Map<String, Integer> cntBefore = new HashMap<>();
        String[] splitBefore = before.split("");
        for(String sb : splitBefore) {
            if(cntBefore.get(sb) == null) cntBefore.put(sb, 1);
            else cntBefore.put(sb, cntBefore.get(sb)+1);
        }
        Map<String, Integer> cntAfter = new HashMap<>();
        String[] splitAfter = after.split("");
        for(String sa : splitAfter) {
            if(cntAfter.get(sa) == null) cntAfter.put(sa, 1);
            else cntAfter.put(sa, cntAfter.get(sa)+1);
        }
        if(cntBefore.equals(cntAfter)) answer = 1;
        return answer;
    }
	
}
