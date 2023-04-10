package programmers1;

public class Divisor {

	//프로그래머스 Level 1. 약수의 합
	//https://school.programmers.co.kr/learn/courses/30/lessons/12928
	public static void main(String[] args) {
		Divisor dv = new Divisor();
		
		int n1 = 12;
		System.out.println(dv.solution(n1));
		
		int n2 = 12;
		System.out.println(dv.solution(n2));
	}
	
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            if(n % i == 0) answer += i;
        }
        
        return answer;
    }

}
