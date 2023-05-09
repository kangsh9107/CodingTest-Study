package programmers0;

import java.util.HashSet;
import java.util.Set;

public class ArraySimilarity {

	//프로그래머스 Level 0. 배열의 유사도
	//https://school.programmers.co.kr/learn/courses/30/lessons/120903
	public static void main(String[] args) {
		ArraySimilarity as = new ArraySimilarity();
		
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		System.out.println(as.solution(s1, s2));
		
//		String[] s3 = {"n", "omg"};
//		String[] s4 = {"m", "dot"};
//		System.out.println(as.solution(s3, s4));
	}

	private int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> equal = new HashSet<>();
        for(String s : s1) {
            if( !equal.add(s) ) answer++;
            equal.add(s);
        }
        for(String ss : s2) {
            if( !equal.add(ss) ) answer++;
            equal.add(ss);
        }
        return answer;
	}

}
