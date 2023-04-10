package programmers1;

import java.util.HashMap;
import java.util.Map;

public class RunningRace {

	//프로그래머스 Level 1. 달리기 경주
	//https://school.programmers.co.kr/learn/courses/30/lessons/178871
	public static void main(String[] args) {
		RunningRace rr = new RunningRace();
		
		String[] players1 = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings1 = {"kai", "kai", "mine", "mine"};
		System.out.println(rr.solution(players1, callings1));
	}
	
	//시간초과
//	public String[] solution(String[] players, String[] callings) {
//		String temp = "";
//		for(int i=0; i<callings.length; i++) {
//			for(int j=0; j<players.length; j++) {
//				if(callings[i].equals(players[j])) {
//					temp = players[j - 1];
//					players[j - 1] = callings[i];
//					players[j] = temp;
//				}
//			}
//		}
//		
//		return players;
//	}
	
	public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];
		Map<String, Integer> rank = new HashMap<>();
		int index = 0;
		for(int i=0; i<players.length; i++) {
			rank.put(players[i], i + 1);
		}
		
		for(int i=0; i<callings.length; i++) {
			index = rank.get(callings[i]) - 1;
			rank.put(callings[i], index);
			rank.put(players[index], rank.get(players[index]) + 1);
		}
		
		return answer;
	}

}
