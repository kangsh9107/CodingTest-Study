package programmers0;

public class Sqrt {

	//프로그래머스 Level 0. 제곱수 판별하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120909
	public static void main(String[] args) {
		Sqrt sq = new Sqrt();
		
		int n1 = 144;
		System.out.println(sq.solution(n1));
		
		int n2 = 976;
		System.out.println(sq.solution(n2));
	}
	
	public int solution(int n) {
        int answer = 2;
        if(Math.sqrt(n) % 1 == 0)  answer = 1;
        return answer;
	}

}
