package programmers0;

public class CountPair {

	//프로그래머스 Level 0. 순서쌍의 개수
	//https://school.programmers.co.kr/learn/courses/30/lessons/120836
	public static void main(String[] args) {
		CountPair cp = new CountPair();
		
		int n1 = 20;
		System.out.println(cp.solution(n1));
		
		int n2 = 100;
		System.out.println(cp.solution(n2));
	}
	
	public int solution(int n) {
		int answer = 0;
		for(int i=1; i<=n; i++) {
			if(n % i == 0) answer++;
		}
		return answer;
	}

}
