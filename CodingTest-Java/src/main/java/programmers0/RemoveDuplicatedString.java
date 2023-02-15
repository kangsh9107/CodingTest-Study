package programmers0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatedString {

	//프로그래머스 Level 0. 중복된 문자 제거
	//https://school.programmers.co.kr/learn/courses/30/lessons/120888
	public static void main(String[] args) {
		RemoveDuplicatedString rds = new RemoveDuplicatedString();
		
//		String my_string1 = "people";
//		System.out.println(rds.solution(my_string1));
		
		String my_string2 = "We are the world";
		System.out.println(rds.solution(my_string2));
	}
	
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<String> hs = new LinkedHashSet<>();
        for(int i=0; i<my_string.length(); i++) {
            hs.add(my_string.substring(i,i+1));
        }
        Iterator<String> iter = hs.iterator();
        while(iter.hasNext()) {
        	answer.append(iter.next());
        }
        return answer.toString();
    }

}
