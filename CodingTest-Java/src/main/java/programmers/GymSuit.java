package programmers;

import java.util.HashMap;
import java.util.Map;

public class GymSuit {

	public static void main(String[] args) {
		GymSuit gs = new GymSuit();
		
		int n1 = 5;
		int[] lost1 = {2,4};
		int[] reserve1 = {1,3,5};
		System.out.println(gs.solution(n1, lost1, reserve1));
		
//		int n2 = 5;
//		int[] lost2 = {2,4};
//		int[] reserve2 = {3};
//		System.out.println(gs.solution(n2, lost2, reserve2));
//		
//		int n3 = 3;
//		int[] lost3 = {3};
//		int[] reserve3 = {1};
//		System.out.println(gs.solution(n3, lost3, reserve3));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		Map<Integer, Integer> currentGymSuit = new HashMap<>();
		for(int i=1; i<=n; i++) {
			currentGymSuit.put(i, 1);
		}
		for(int i=0; i<reserve.length; i++) {
			currentGymSuit.put(reserve[i], 2);
		}
		for(int i=0; i<lost.length; i++) {
			currentGymSuit.put(lost[i], currentGymSuit.get(lost[i])-1);
		}

		for(Integer key : currentGymSuit.keySet()) {
			if(currentGymSuit.get(key) == 2) {
				try {
					if(currentGymSuit.get(key+1) == 0) {
						currentGymSuit.put(key, 1);
						currentGymSuit.put(key+1, 1);
					}
				} catch(Exception e) {
					
				}
			}
		}
		for(Integer key : currentGymSuit.keySet()) {
			if(currentGymSuit.get(key) == 2) {
				try {
					if(currentGymSuit.get(key-1) == 0) {
						currentGymSuit.put(key, 1);
						currentGymSuit.put(key-1, 1);
					}
				} catch(Exception e) {
					
				}
			}
		}
		for(Integer key : currentGymSuit.keySet()) {
			if(currentGymSuit.get(key) > 0) answer++;
		}
		
		int answer2 = 0;
		Map<Integer, Integer> currentGymSuit2 = new HashMap<>();
		for(int i=1; i<=n; i++) {
			currentGymSuit2.put(i, 1);
		}
		for(int i=0; i<reserve.length; i++) {
			currentGymSuit2.put(reserve[i], 2);
		}
		for(int i=0; i<lost.length; i++) {
			currentGymSuit2.put(lost[i], currentGymSuit2.get(lost[i])-1);
		}

		for(Integer key : currentGymSuit2.keySet()) {
			if(currentGymSuit2.get(key) == 2) {
				try {
					if(currentGymSuit2.get(key-1) == 0) {
						currentGymSuit2.put(key, 1);
						currentGymSuit2.put(key-1, 1);
					}
				} catch(Exception e) {
					
				}
			}
		}
		for(Integer key : currentGymSuit2.keySet()) {
			if(currentGymSuit2.get(key) == 2) {
				try {
					if(currentGymSuit2.get(key+1) == 0) {
						currentGymSuit2.put(key, 1);
						currentGymSuit2.put(key+1, 1);
					}
				} catch(Exception e) {
					
				}
			}
		}
		for(Integer key : currentGymSuit2.keySet()) {
			if(currentGymSuit2.get(key) > 0) answer2++;
		}
		
		return Math.max(answer, answer2);
	}

}
