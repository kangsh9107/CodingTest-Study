package programmers1;

public class DartGame {

	//프로그래머스 Level 1. [1차] 다트 게임
	//https://school.programmers.co.kr/learn/courses/30/lessons/17682
	public static void main(String[] args) {
		DartGame dg = new DartGame();
		
//		String dartResult1 = "1S2D*3T";
//		System.out.println(dg.solution(dartResult1));
//		
//		String dartResult2 = "1D2S#10S";
//		System.out.println(dg.solution(dartResult2));
//		
//		String dartResult3 = "1D2S0T";
//		System.out.println(dg.solution(dartResult3));
		
		String dartResult4 = "1S*2T*3S";
		System.out.println(dg.solution(dartResult4));
		
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
		
		int index = 0;
		int[] score = new int[3];
		String[] tempScore = dartResult.split("[SDT*#]");
		for(int i=0; i<tempScore.length; i++) {
			if(tempScore[i].equals("")) {
				continue;
			} else {
				score[index] = Integer.parseInt(tempScore[i]);
				index++;
			}
		}
		
		index = 0;
		String[] bonus = dartResult.split("[0123456789*#]");
		for(int i=0; i<bonus.length; i++) {
			if(bonus[i].equals("")) {
				continue;
			} else if(bonus[i].equals("S")) {
				index++;
			} else if(bonus[i].equals("D")) {
				score[index] = score[index] * score[index];
				index++;
			} else if(bonus[i].equals("T")) {
				score[index] = score[index] * score[index] * score[index];
				index++;
			}
		}
		
		index = 0;
		String[] star = dartResult.split("[0123456789]");
		for(int i=0; i<star.length; i++) {
			if(star[i].equals("")) {
				continue;
			} else if(star[i].length() == 1) {
				index++;
			} else if(star[i].length() == 2 && star[i].substring(1).equals("*")) {
				score[index] *= 2;
				if(index > 0) score[index - 1] *= 2;
				index++;
			} else if(star[i].length() == 2 && star[i].substring(1).equals("#")) {
				score[index] *= (-1);
				index++;
			}
		}
		
		for(int i=0; i<score.length; i++) {
			answer += score[i];
		}
		
		return answer;
	}

}
