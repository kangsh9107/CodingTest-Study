package programmers1;

public class GcdLcm {

	//프로그래머스 Level 1. 최대공약수와 최소공배수
	//https://school.programmers.co.kr/learn/courses/30/lessons/12940
	public static void main(String[] args) {
		GcdLcm gl = new GcdLcm();
		
		int n1 = 3;
		int m1 = 12;
		System.out.println(gl.solution(n1, m1));
		
		int n2 = 2;
		int m2 = 5;
		System.out.println(gl.solution(n2, m2));
	}
	
	int[] solution(int n, int m) {
		int a = gcd(n, m);
		int b = (n * m) / a;
		
		int[] answer = {a, b};
		return answer;
	}
	
	int gcd(int a, int b) {
		int large = Math.max(a, b);
		int small = Math.min(a, b);
		
		if(b == 0) return large;
		else       return gcd(small, large % small);
	}
	
}
