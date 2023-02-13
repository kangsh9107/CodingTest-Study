package programmers;

import java.util.HashMap;
import java.util.Map;

public class NotFinishAthletes {
	
	//프로그래머스 Level 1. 완주하지 못한 선수
	//https://school.programmers.co.kr/learn/courses/30/lessons/42576
	public static void main(String[] args) {
		NotFinishAthletes nfa = new NotFinishAthletes();
		
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		System.out.println(nfa.solution(participant1, completion1));
		
//		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
//		System.out.println(nfa.solution(participant2, completion2));
//		
//		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
//		String[] completion3 = {"stanko", "ana", "mislav"};
//		System.out.println(nfa.solution(participant3, completion3));
	}
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Map<String, Integer> countName = new HashMap<>();
		for(String p : participant) {
			if(countName.get(p) == null) countName.put(p, 1);
			else                         countName.put(p, countName.get(p)+1);
		}
		for(String c : completion) {
			if(countName.get(c) == null) countName.put(c, 1);
			else                         countName.put(c, countName.get(c)+1);
		}
		for(String key : countName.keySet()) {
			if(countName.get(key) % 2 != 0) answer = key;
		}
		
		return answer;
	}

}
