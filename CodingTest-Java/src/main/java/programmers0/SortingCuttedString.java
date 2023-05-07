package programmers0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingCuttedString {

	//프로그래머스 Level 0. 문자열 잘라서 정렬하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181866
	public static void main(String[] args) {
		SortingCuttedString scs = new SortingCuttedString();
		
//		String myString1 = "axbxcxdx";
//		System.out.println(scs.solution(myString1));
//		
//		String myString2 = "dxccxbbbxaaaa";
//		System.out.println(scs.solution(myString2));
		
		String myString3 = "dxccxxxxbbbxxxxxaaaa";
		System.out.println(scs.solution(myString3));
	}

	private List<String> solution(String myString) {
		List<String> answer = new ArrayList<>();
        String[] split = myString.split("x");
        Arrays.sort(split);
        for(int i=0; i<split.length; i++) {
        	if( !split[i].equals("") ) answer.add(split[i]);
        }
        return answer;
	}

}
