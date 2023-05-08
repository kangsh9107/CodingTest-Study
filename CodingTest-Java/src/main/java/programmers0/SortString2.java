package programmers0;

import java.util.Arrays;

public class SortString2 {

	//프로그래머스 Level 0. 문자열 정렬하기 (2)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120911
	public static void main(String[] args) {
		SortString2 ss = new SortString2();
		
		String my_string1 = "Bcad";
		System.out.println(ss.solution(my_string1));
		
		String my_string2 = "heLLo";
		System.out.println(ss.solution(my_string2));
		
		String my_string3 = "Python";
		System.out.println(ss.solution(my_string3));
	}
	
	public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] sortAnswer = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++) {
            sortAnswer[i] = my_string.substring(i, i+1).toLowerCase();
        }
        Arrays.sort(sortAnswer);
        for(int i=0; i<sortAnswer.length; i++) {
            answer.append(sortAnswer[i]);
        }
        return answer.toString();
	}

}
