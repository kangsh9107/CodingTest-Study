package programmers0;

import java.util.ArrayList;
import java.util.List;

public class RemoveAD {

	//프로그래머스 Level 0. ad 제거하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181870
	public static void main(String[] args) {
		RemoveAD rad = new RemoveAD();
		
		String[] strArr1 = {"and","notad","abcd"};
		System.out.println(rad.solution(strArr1));
		
		String[] strArr2 = {"there","are","no","a","ds"};
		System.out.println(rad.solution(strArr2));
	}

	private List<String> solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(String s : strArr) {
            if( !s.contains("ad") ) answer.add(s);
        }
        return answer;
	}

}
