package programmers0;

public class CountUp {

	//프로그래머스 Level 0. 카운트 업
	//https://school.programmers.co.kr/learn/courses/30/lessons/181920
	public static void main(String[] args) {
		CountUp cu = new CountUp();
		
		int start1 = 3;
		int end1 = 10;
		System.out.println(cu.solution(start1, end1));
	}

	private int[] solution(int start, int end) {
		int[] answer = new int[end - start + 1];
		int idx = 0;
		
		for (int i=0; i<answer.length; i++) {
			answer[i] = start;
			start++;
		}
		
		return answer;
	}

}
