package programmers0;

import java.util.ArrayList;
import java.util.List;

public class CutAndStoreAsArray {

	//프로그래머스 Level 0. 잘라서 배열로 저장하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120913
	public static void main(String[] args) {
		CutAndStoreAsArray casaa = new CutAndStoreAsArray();
		
		String my_str1 = "abc1Addfggg4556b";
		int n1 = 6;
		System.out.println(casaa.solution(my_str1, n1));
		
		String my_str2 = "abcdef123";
		int n2 = 3;
		System.out.println(casaa.solution(my_str2, n2));
	}

	private List<String> solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<my_str.length(); i+=n) {
            if(i+n < my_str.length()) {
                answer.add(my_str.substring(i, i+n));
            } else {
                answer.add(my_str.substring(i));
                break;
            }
        }
        return answer;
	}

}
