package programmers0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString1 {

	//프로그래머스 Level 0. 문자열 정렬하기 (1)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120850
	public static void main(String[] args) {
		SortString1 ss = new SortString1();
		
		String my_string1 = "hi12392";
		System.out.println(ss.solution(my_string1));
		
//		String my_string2 = "p2o4i8gj2";
//		System.out.println(ss.solution(my_string2));
//		
//		String my_string3 = "abcde0";
//		System.out.println(ss.solution(my_string3));
	}

	private List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        String[] splitMy_string = my_string.split("");
        for(String s : splitMy_string) {
            try {
                answer.add(Integer.parseInt(s));
            } catch(Exception e) {
                
            }
        }
        Collections.sort(answer);
        return answer;
	}

}
