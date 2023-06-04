package programmers0;

public class CountDown {

	//프로그래머스 Level 0. 카운트 다운
	//https://school.programmers.co.kr/learn/courses/30/lessons/181899
	public static void main(String[] args) {
		CountDown cd = new CountDown();
		
		int start1 = 10;
		int end1 = 3;
		System.out.println(cd.solution(start1, end1));
	}

	private int[] solution(int start, int end) {
		int[] answer = new int[start - end + 1];
		for (int i=0; i<answer.length; i++) {
			answer[i] = start--;
		}
		
		return answer;
	}

}
