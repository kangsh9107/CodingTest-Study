package programmers;

import java.util.Arrays;

public class AppleSalesMan {

	//프로그래머스 Level 1. 과일 장수
	//https://school.programmers.co.kr/learn/courses/30/lessons/135808
	public static void main(String[] args) {
		AppleSalesMan asm = new AppleSalesMan();
		
//		int k1 = 3;
//		int m1 = 4;
//		int[] score1 = {1,2,3,1,2,3,1};
//		System.out.println(asm.solution(k1, m1, score1));
		
		int k2 = 4;
		int m2 = 3;
		int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		System.out.println(asm.solution(k2, m2, score2));
	}
	
	public int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		StringBuilder box = new StringBuilder();
		for(int i=score.length-1; i>=0; i--) {
			box.append(score[i]);
			if(box.length() == m) {
				answer += m * Integer.parseInt(box.substring(m-1));
				box.setLength(0);
			}
		}
		return answer;
	}

}
