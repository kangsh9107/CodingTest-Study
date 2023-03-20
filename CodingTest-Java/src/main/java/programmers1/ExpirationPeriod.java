package programmers1;

import java.util.HashMap;
import java.util.Map;

public class ExpirationPeriod {

	//프로그래머스 Level 1. 개인정보 수집 유효기간
	//https://school.programmers.co.kr/learn/courses/30/lessons/150370
	public static void main(String[] args) {
		ExpirationPeriod ep = new ExpirationPeriod();
		
		String today1 = "2022.05.19";
		String[] terms1 = {"A 6", "B 12", "C 3"};
		String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		System.out.println(ep.solution(today1, terms1, privacies1));
		
//		String today2 = "2020.01.01";
//		String[] terms2 = {"Z 3", "D 5"};
//		String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
//		System.out.println(ep.solution(today2, terms2, privacies2));
	}
	
	public int[] solution(String today, String[] terms, String[] privacies) {
		int[] answer = new int[privacies.length];
		Map<String, Integer> hm = new HashMap<>();
		for(int i=0; i<terms.length; i++) {
			hm.put(terms[i].substring(0, 1), Integer.parseInt(terms[i].substring(2)));
		}
		System.out.println(hm);
		
		int[] days = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
		
		
		
		return answer;
	}

}
