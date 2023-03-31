package programmers1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	
	public List<Integer> solution(String today, String[] terms, String[] privacies) {
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> hm = new HashMap<>();
		for(int i=0; i<terms.length; i++) {
			int year = Integer.parseInt(today.replaceAll("\\.", "").substring(0, 4));
			int month = Integer.parseInt(today.replaceAll("\\.", "").substring(4, 6));
			String day = today.replaceAll("\\.", "").substring(6);
			month += year * 12;
			
			String alphabet = terms[i].substring(0, 1);
			int len = Integer.parseInt(terms[i].substring(2));
			
			month -= len;
			year = month / 12;
			month %= 12;
			if(month == 0) month = 12;
			
			sb.append(year);
			if(month < 10) sb.append("0" + month);
			else sb.append(month);
			sb.append(day);
			hm.put(alphabet, Integer.parseInt(sb.toString()));
			sb.setLength(0);
		}
		
		List<Integer> answer = new ArrayList<>();
		for(int i=0; i<privacies.length; i++) {
			String[] check = privacies[i].split(" ");
			if(Integer.parseInt(check[0].replaceAll("\\.", "")) <= hm.get(check[1])) answer.add(i + 1); 
		}
		
		return answer;
	}

}
