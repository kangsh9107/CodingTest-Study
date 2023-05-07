package programmers0;

public class LambSkewers {

	//프로그래머스 Level 0. 양꼬치
	//https://school.programmers.co.kr/learn/courses/30/lessons/120830
	public static void main(String[] args) {
		LambSkewers ls = new LambSkewers();
		
		int n1 = 10;
		int k1 = 3;
		System.out.println(ls.solution(n1, k1));
		
		int n2 = 64;
		int k2 = 6;
		System.out.println(ls.solution(n2, k2));
	}

	private int solution(int n, int k) {
        int answer = 0;
        k -= (int)(n/10);
        answer = (n*12000) + (k*2000);
        return answer;
	}

}
