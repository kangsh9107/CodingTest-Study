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
		Map<Integer, Integer> max = new HashMap<>();
		for(int i=1; i<=n; i++) {
			max.put(i, 1);
		}
		for(int j=0; j<lost.length; j++) {
			max.put(lost[j], 0);
		}
		for(int k=0; k<reserve.length; k++) {
			max.put(reserve[k], 2);
		}
		
		for(int l=1; l<=n; l++) {
			if(max.get(l) == 2) {
				try {
					if(max.get(l+1) == 0) {
						max.put(l, 1);
						max.put(l+1, 1);
					} else if(max.get(l-1) == 0) {
						max.put(l, 1);
						max.put(l-1, 1);
					}
				} catch(Exception e) {
					
				}
			}
		}
		for(Integer key : max.keySet()) {
			if(max.get(key) > 0) answer++;
		}
		
		return answer;
	}

}
