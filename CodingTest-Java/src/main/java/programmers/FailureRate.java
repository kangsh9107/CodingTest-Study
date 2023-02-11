package programmers;

import java.util.HashMap;
import java.util.Map;

public class FailureRate {

	//프로그래머스 Level 1. 실패율
	//https://school.programmers.co.kr/learn/courses/30/lessons/42889
	public static void main(String[] args) {
		FailureRate fr = new FailureRate();
		
		int N1 = 5;
		int[] stages1 = {2,1,2,6,2,4,3,3};
		System.out.println(fr.solution(N1, stages1));
		
//		int N2 = 4;
//		int[] stages2 = {4,4,4,4,4};
//		System.out.println(fr.solution(N2, stages2));
	}
	
	public int[] solution(int N, int[] stages) {
		int[] answer = {};
		
		Map<Integer, Integer> hm = new HashMap<>();
		for(int s : stages) {
			if(hm.get(s) == null) hm.put(s, 1);
			else                  hm.put(s, hm.get(s)+1);
		}
		
		Map<Integer, Double> hm2 = new HashMap<>();
		for(int i=1; i<=N; i++) {
			if(i == 1) {
				hm2.put(hm.get(i), hm.get(i) / (double)stages.length);
			} else {
				
			}
		}
		
		return answer;
	}

}
