package programmers0;

import java.util.ArrayList;
import java.util.List;

public class HateEven {

	//프로그래머스 Level 0. 짝수는 싫어요
	//https://school.programmers.co.kr/learn/courses/30/lessons/120813
	public static void main(String[] args) {
		HateEven he = new HateEven();
		
		int n1 = 10;
		System.out.println(he.solution(n1));
		
		int n2 = 15;
		System.out.println(he.solution(n2));
	}

	private List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i+=2) {
            if(i % 2 != 0) answer.add(i);
        }
        return answer;
	}

}
