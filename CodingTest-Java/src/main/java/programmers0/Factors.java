package programmers0;

import java.util.ArrayList;
import java.util.List;

public class Factors {

	//프로그래머스 Level 0. 약수 구하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120897
	public static void main(String[] args) {
		Factors f = new Factors();
		
		int n1 = 24;
		System.out.println(f.solution(n1));
		
		int n2 = 29;
		System.out.println(f.solution(n2));
	}

	private List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n % i == 0) answer.add(i);
        }
        return answer;
	}

}
