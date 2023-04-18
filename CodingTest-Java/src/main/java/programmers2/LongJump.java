package programmers2;

public class LongJump {

	//프로그래머스 Level 1. 멀리 뛰기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12914
	public static void main(String[] args) {
		LongJump lj = new LongJump();
		
		int n1 = 4;
		System.out.println(lj.solution(n1));
		
//		int n2 = 3;
//		System.out.println(lj.solution(n2));
	}
	
	public int solution(int n) {
		/*
		 * n = 1
		 * 1
		 * 
		 * n = 2
		 * 1 1
		 * 2
		 * 
		 * n = 3
		 * 1 1 1
		 * 1 2
		 * 2 1
		 * 
		 * n = 4
		 * 1 1 1 1
		 * 1 1 2
		 * 1 2 1
		 * 2 1 1
		 * 2 2
		 * 
		 * n = 5
		 * 1 1 1 1 1
		 * 1 1 1 2
		 * 1 1 2 1
		 * 1 2 1 1
		 * 2 1 1 1
		 * 1 2 2
		 * 2 1 2
		 * 2 2 1
		 * 
		 * 1, 2, 3, 5, 8, ... 피보나치 수열의 형태를 띈다.
		 * 점화식으로 나타내면 i번째 = i-1번째 + i-2번째
		 */
		int[] answer = new int[2001]; //n이 2000이하.
		answer[1] = 1;                //n칸을 갈때 계산을 편하게 하기 위해 0은 그냥 무시.
		answer[2] = 2;
		for(int i=3; i<answer.length; i++) {
			answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567; //문제조건.
		}
		
		return answer[n];
	}

}
