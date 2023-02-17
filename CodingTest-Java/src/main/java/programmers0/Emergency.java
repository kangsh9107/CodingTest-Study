package programmers0;

import java.util.Arrays;
import java.util.Collections;

public class Emergency {

	//프로그래머스 Level 0. 진료순서 정하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120835
	public static void main(String[] args) {
		Emergency eg = new Emergency();
		
		int[] emergency1 = {3, 76, 24};
		System.out.println(eg.solution(emergency1));
		
//		int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
//		System.out.println(eg.solution(emergency2));
//		
//		int[] emergency3 = {30, 10, 23, 6, 100};
//		System.out.println(eg.solution(emergency3));
	}
	
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] sortedEmergency = new Integer[emergency.length];
        for(int i=0; i<emergency.length; i++) {
        	sortedEmergency[i] = emergency[i];
        }
        Arrays.sort(sortedEmergency, Collections.reverseOrder());
        
        for(int i=0; i<emergency.length; i++) {
        	for(int j=0; j<sortedEmergency.length; j++) {
        		if(emergency[i] == sortedEmergency[j]) answer[i] = j + 1;
        	}
        }
        
        return answer;
    }

}
