package programmers0;

public class RoundingTwoDimension {

	//프로그래머스 Level 0. 이차원 배열 대각선 순회하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181829
	public static void main(String[] args) {
		RoundingTwoDimension rtd = new RoundingTwoDimension();
		
		int[][] board1 = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
		int k1 = 2;
		System.out.println(rtd.solution(board1, k1));
	}
	
	public int solution(int[][] board, int k) {
		int answer = 0;
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if(i + j <= k) answer += board[i][j];
			}
		}
		
		return answer;
	}

}
