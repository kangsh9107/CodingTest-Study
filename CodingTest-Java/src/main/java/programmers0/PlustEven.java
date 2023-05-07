package programmers0;

public class PlustEven {

	//프로그래머스 Level 0. 짝수의 합
	//https://school.programmers.co.kr/learn/courses/30/lessons/120831
	public static void main(String[] args) {
		PlustEven pe = new PlustEven();
		
		int n1 = 10;
		System.out.println(pe.solution(n1));
		
		int n2 = 4;
		System.out.println(pe.solution(n2));
	}

	private int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i+=2) {
            answer += i;
        }
        return answer;
	}

}
