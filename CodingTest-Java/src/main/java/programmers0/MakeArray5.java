package programmers0;

import java.util.ArrayList;
import java.util.List;

public class MakeArray5 {

	//프로그래머스 Level 0. 배열 만들기 5
	//https://school.programmers.co.kr/learn/courses/30/lessons/181912
	public static void main(String[] args) {
		MakeArray5 ma = new MakeArray5();
		
		String[] intStrs1 = {"0123456789", "9876543210", "9999999999999"};
		int k1 = 50000;
		int s1 = 5;
		int l1 = 5;
		System.out.println(ma.solution(intStrs1, k1, s1, l1));
	}

	private List<Integer> solution(String[] intStrs, int k, int s, int l) {
		List<Integer> answer = new ArrayList<>();
		
		for (int i=0; i<intStrs.length; i++) {
			int num = Integer.parseInt(intStrs[i].substring(s, s + l));
			if (num > k) answer.add(num);
		}
		
		return answer;
	}

}
