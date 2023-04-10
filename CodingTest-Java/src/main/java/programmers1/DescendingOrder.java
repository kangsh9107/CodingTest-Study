package programmers1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

	//프로그래머스 Level 1. 문자열 내림차순으로 배치하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12917
	public static void main(String[] args) {
		DescendingOrder desc = new DescendingOrder();
		
		String s1 = "Zbcdefg";
		System.out.println(desc.solution(s1));
	}
	
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] temp = s.split("");
        List<String> list = new ArrayList<>();
        for(String t : temp) {
            list.add(t);
        }
        Collections.sort(list);
        for(String l : list) {
            answer.append(l);
        }
        
        return answer.reverse().toString();
    }

}
