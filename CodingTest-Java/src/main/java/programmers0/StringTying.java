package programmers0;

import java.util.HashMap;
import java.util.Map;

public class StringTying {

	//프로그래머스 Level 0. 문자열 묶기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181855
	public static void main(String[] args) {
		StringTying st = new StringTying();
		
		String[] strArr1 = {"a","bc","d","efg","hi"};
		System.out.println(st.solution(strArr1));
	}
	
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<strArr.length; i++) {
            int len = strArr[i].length();
            if(hm.containsKey(len)) hm.put(len, hm.get(len) + 1);
            else hm.put(len, 1);
        }
        for(int key : hm.keySet()) {
            answer = Math.max(hm.get(key), answer);
        }
        
        return answer;
    }

}
