package programmers1;

public class CraneDrawGame {

	//프로그래머스 Level 1. 크레인 인형뽑기 게임
	//https://school.programmers.co.kr/learn/courses/30/lessons/64061
	public static void main(String[] args) {
		CraneDrawGame cdg = new CraneDrawGame();
		
		int[][] board1 = { {0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1} };
		int[] moves1 = {1,5,3,5,1,2,1,4};
		System.out.println(cdg.solution(board1, moves1));
	}
	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		
		
		return answer;
	}

}
