package programmers0;

import java.util.ArrayList;
import java.util.List;

public class CreatingACollatzSequence {

	//프로그래머스 Level 0. 콜라츠 수열 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181919
	public static void main(String[] args) {
		CreatingACollatzSequence cacs = new CreatingACollatzSequence();
		
		int n1 = 10;
		System.out.println(cacs.solution(n1));
	}

	private List<Integer> solution(int n) {
		List<Integer> answer = new ArrayList<>();
		answer.add(n);
		
		while(true) {
			if (n == 1) {
				break;
			} else if (n % 2 == 0) {
				n /= 2;
				answer.add(n);
			} else {
				n = (3 * n) + 1;
				answer.add(n);
			}
		}
		
		return answer;
	}

}
