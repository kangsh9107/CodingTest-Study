package programmers0;

public class BacterialGrowth {

	//프로그래머스 Level 0. 세균 증식
	//https://school.programmers.co.kr/learn/courses/30/lessons/120910
	public static void main(String[] args) {
		BacterialGrowth bg = new BacterialGrowth();
		
		int n1 = 2;
		int t1 = 10;
		System.out.println(bg.solution(n1, t1));
		
		int n2 = 7;
		int t2 = 15;
		System.out.println(bg.solution(n2, t2));
	}

	private int solution(int n, int t) {
        for(int i=0; i<t; i++) {
            n *= 2;
        }
        return n;
	}

}
