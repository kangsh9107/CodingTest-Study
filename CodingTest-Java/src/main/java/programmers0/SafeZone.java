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
		
		//지뢰 체크
		int[][] map = new int[board.length][board.length];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[i][j] == 1) {
					bomb(i, j, map);
				}
			}
		}
		//안전지대 카운팅
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map.length; j++) {
				if(map[i][j] == 0) answer++;
			}
		}
		
		return answer;
	}
	
	//지뢰 표시
	public void bomb(int i, int j, int[][] map) {
		int n = map.length; //map 최대 크기
		
		map[i][j] = 1;
		if(i > 0)     map[i - 1][j] = 1;
		if(i < n - 1) map[i + 1][j] = 1;
		if(j > 0)     map[i][j - 1] = 1;
		if(j < n - 1) map[i][j + 1] = 1;
		if(i < n - 1 && j < n - 1) map[i + 1][j + 1] = 1;
		if(i < n - 1 && j > 0)     map[i + 1][j - 1] = 1;
		if(i > 0 && j < n - 1)     map[i - 1][j + 1] = 1;
		if(i > 0 && j > 0)         map[i - 1][j - 1] = 1;
	}

}
