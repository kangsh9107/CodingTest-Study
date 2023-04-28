package programmers0;

public class SpecialTwoDimensionArray {

	//프로그래머스 Level 0. 특별한 이차원 배열 1
	//https://school.programmers.co.kr/learn/courses/30/lessons/181833
	public static void main(String[] args) {
		SpecialTwoDimensionArray stda = new SpecialTwoDimensionArray();
		
		int n1 = 3;
		System.out.println(stda.solution(n1));
		
//		int n2 = 6;
//		System.out.println(stda.solution(n2));
//		
//		int n3 = 1;
//		System.out.println(stda.solution(n3));
	}

	private int[][] solution(int n) {
		int[][] answer = new int[n][n];
		for(int i=0; i<answer.length; i++) {
			answer[i][i] = 1;
		}
		
		return answer;
	}
	
	

}
