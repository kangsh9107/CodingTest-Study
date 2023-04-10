package programmers1;

public class Cola {
	
	//프로그래머스 Level 1. 콜라 문제
	//https://school.programmers.co.kr/learn/courses/30/lessons/132267
	public static void main(String[] args) {
		int answer = 0;
		int a = 3;
		int b = 1;
		int n = 20;
		
		while(n >= a) {
			answer += (int)(n/a)*b;
			n = (n - (((int)(n/a))*a)) + (int)(n/a)*b;
		}
		
		System.out.println(answer);
	}
	
}
