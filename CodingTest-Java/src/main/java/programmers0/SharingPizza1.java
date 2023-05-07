package programmers0;

public class SharingPizza1 {

	//프로그래머스 Level 0. 피자 나눠 먹기 (1)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120814
	public static void main(String[] args) {
		SharingPizza1 sp = new SharingPizza1();
		
		int n1 = 7;
		System.out.println(sp.solution(n1));
		
		int n2 = 1;
		System.out.println(sp.solution(n2));
		
		int n3 = 15;
		System.out.println(sp.solution(n3));
	}

	private int solution(int n) {
        return ((double)n/7) > (int)((double)n/7) ? (n/7)+1 : n/7;
	}

}
