package programmers0;

public class MakeArray1 {

	//프로그래머스 Level 0. 배열 만들기 1
	//https://school.programmers.co.kr/learn/courses/30/lessons/181901
	public static void main(String[] args) {
		MakeArray1 ma = new MakeArray1();
		
		int n1 = 10;
		int k1 = 3;
		System.out.println(ma.solution(n1, k1));
		
//		int n2 = 15;
//		int k2 = 5;
//		System.out.println(ma.solution(n2, k2));
	}

	private int[] solution(int n, int k) {
		int[] answer = new int[n / k];
		for (int i=0; i<answer.length; i++) {
			answer[i] = (i + 1) * k;
		}
		
		return answer;
	}

}
