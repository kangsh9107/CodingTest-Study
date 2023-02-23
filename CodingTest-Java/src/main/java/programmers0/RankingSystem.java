package programmers0;

import java.util.Arrays;
import java.util.Collections;

public class RankingSystem {

	public static void main(String[] args) {
		RankingSystem rs = new RankingSystem();
		
//		int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
//		System.out.println(rs.solution(score1));
		
		int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
		System.out.println(rs.solution(score2));
	}
	
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] avg = new int[score.length];
        Integer[] sortedAvg = new Integer[score.length];
        for(int i=0; i<score.length; i++) {
        	avg[i] = (score[i][0] + score[i][1]) / 2;
        	sortedAvg[i] = (score[i][0] + score[i][1]) / 2;
        }
        Arrays.sort(sortedAvg, Collections.reverseOrder());
        
        for(int i=0; i<sortedAvg.length; i++) {
        	for(int j=0; j<avg.length; j++) {
        		if(sortedAvg[i] == avg[j]) {
        			answer[j] = i + 1;
        			avg[j] = -1;
        		}
        	}
        }
        
        return answer;
    }

}
