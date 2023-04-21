package programmers0;

public class SafeZone {

	//프로그래머스 Level 0. 안전지대
	//https://school.programmers.co.kr/learn/courses/30/lessons/120866
	public static void main(String[] args) {
		SafeZone sz = new SafeZone();
		
		int[][] board1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
		System.out.println(sz.solution(board1));
		
//		int[][] board2 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
//		System.out.println(sz.solution(board2));
//		
//		int[][] board3 = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
//		System.out.println(sz.solution(board3));
	}
	
	public int solution(int[][] board) {
		int answer = 0;
		
		int[][] map = new int[board.length][board.length];
		boolean[][] visited = new boolean[board.length][board.length];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				map[i][j] = board[i][j];
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		return answer;
	}

}
