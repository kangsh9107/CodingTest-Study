package programmers0;

import java.util.ArrayList;
import java.util.List;

public class PickN {

	//프로그래머스 Level 0. n의 배수 고르기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120905
	public static void main(String[] args) {
		PickN pn = new PickN();
		
		int n1 = 3;
		int[] numlist1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		System.out.println(pn.solution(n1, numlist1));
		
		int n2 = 5;
		int[] numlist2 = {1, 9, 3, 10, 13, 5};
		System.out.println(pn.solution(n2, numlist2));
		
		int n3 = 12;
		int[] numlist3 = {2, 100, 120, 600, 12, 12};
		System.out.println(pn.solution(n3, numlist3));
	}

	private List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for(int num : numlist) {
            if(num % n == 0) answer.add(num);
        }
        return answer;
	}

}
