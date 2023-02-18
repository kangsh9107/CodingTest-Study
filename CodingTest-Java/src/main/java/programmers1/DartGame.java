package programmers1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DartGame {

	//프로그래머스 Level 1. [1차] 다트 게임
	//https://school.programmers.co.kr/learn/courses/30/lessons/17682
	public static void main(String[] args) {
		DartGame dg = new DartGame();
		
//		String dartResult1 = "1S2D*3T";
//		System.out.println(dg.solution(dartResult1));
		
		String dartResult2 = "1D2S#10S";
		System.out.println(dg.solution(dartResult2));
//		
//		String dartResult3 = "1D2S0T";
//		System.out.println(dg.solution(dartResult3));
//		
//		String dartResult4 = "1S*2T*3S";
//		System.out.println(dg.solution(dartResult4));
//		
//		String dartResult5 = "1D#2S*3S";
//		System.out.println(dg.solution(dartResult5));
//		
//		String dartResult6 = "1T2D3D#";
//		System.out.println(dg.solution(dartResult6));
//		
//		String dartResult7 = "1D2S3T*";
//		System.out.println(dg.solution(dartResult7));
	}
	
	public int solution(String dartResult) {
		int answer = 0;
		
		String[] splitDartResult = dartResult.split("");
		Map<Integer, Integer> indexScore = new HashMap<>();
		Map<Integer, String> indexBonusOption = new HashMap<>();
		for(int i=0; i<splitDartResult.length; i++) {
			try {
				indexScore.put(i, Integer.parseInt(splitDartResult[i]));
			} catch(Exception e) {
				indexBonusOption.put(i, splitDartResult[i]);
			}
		}
		System.out.println(indexScore);
		
		List<Integer> score = new ArrayList<>();
		for(int i=0; i<12; i++) {
			try {
				indexScore.get(i);
			} catch(Exception e) {
				
			}
		}
		
		return answer;
	}

}
