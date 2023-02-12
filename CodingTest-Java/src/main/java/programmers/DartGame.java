package programmers;

import java.util.ArrayList;
import java.util.List;

public class DartGame {

	public static void main(String[] args) {
		DartGame dg = new DartGame();
		
		String dartResult1 = "1S2D*3T";
		System.out.println(dg.solution(dartResult1));
		
//		String dartResult2 = "1D2S#10S";
//		System.out.println(dg.solution(dartResult2));
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
		for(int i=0; i<splitDartResult.length; i++) {
			try {
				Integer.parseInt(splitDartResult[i]);
			} catch(Exception e) {
				
			}
		}
		
		return answer;
	}

}
