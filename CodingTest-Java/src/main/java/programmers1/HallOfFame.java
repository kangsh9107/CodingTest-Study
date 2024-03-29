package programmers1;

import java.util.ArrayList;
import java.util.List;

public class HallOfFame {

	//프로그래머스 Level 1. 명예의 전당 (1)
	//https://school.programmers.co.kr/learn/courses/30/lessons/138477
	public static void main(String[] args) {
		HallOfFame hof = new HallOfFame();
		
		int k1 = 3;
		int[] score1 = {10, 100, 20, 150, 1, 100, 200};
		System.out.println(hof.solution(k1, score1));
		
		int k2 = 4;
		int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		System.out.println(hof.solution(k2, score2));
	}
	
    public List<Integer> solution(int k, int[] score) {
		List<Integer> answer = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		int min = 2001;
		
		for(int i=0; i<score.length; i++) {
			min = 2001;
			
			temp.add(score[i]);
			
			for(Integer t : temp) {
				if(t < min) min = t;
			}
			
			if(temp.size() > k) {
				temp.remove(Integer.valueOf(min));
				min = 2001;
				
				for(Integer m : temp) {
					if(m < min) min = m;
				}
			}
			
			answer.add(min);
		}

		return answer;
    }

}
