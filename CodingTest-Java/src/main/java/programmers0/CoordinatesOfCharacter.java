package programmers0;

public class CoordinatesOfCharacter {

	//프로그래머스 Level 0. 캐릭터의 좌표
	//https://school.programmers.co.kr/learn/courses/30/lessons/120861
	public static void main(String[] args) {
		CoordinatesOfCharacter coc = new CoordinatesOfCharacter();
		
		String[] keyinput1 = {"left", "right", "up", "right", "right"};
		int[] board1 = {11, 11};
		System.out.println(coc.solution(keyinput1, board1));
		
		String[] keyinput2 = {"down", "down", "down", "down", "down"};
		int[] board2 = {7, 9};
		System.out.println(coc.solution(keyinput2, board2));
	}

	private int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String k : keyinput) {
            if(k.equals("left") && answer[0] != ((int)(board[0]/2))*(-1)) answer[0] -= 1;
            else if(k.equals("right") && answer[0] != (int)(board[0]/2)) answer[0] += 1;
            else if(k.equals("down") && answer[1] != ((int)(board[1]/2))*(-1)) answer[1] -= 1;
            else if(k.equals("up") && answer[1] != (int)(board[1]/2)) answer[1] += 1;
        }
        return answer;
	}

}
