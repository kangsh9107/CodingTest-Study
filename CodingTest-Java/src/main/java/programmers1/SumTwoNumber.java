package programmers1;

public class SumTwoNumber {

	//프로그래머스 Level 1. 두 정수 사이의 합
	//https://school.programmers.co.kr/learn/courses/30/lessons/12912
	public static void main(String[] args) {
		SumTwoNumber stn = new SumTwoNumber();
		
		int a1 = 3;
		int b1 = 5;
		System.out.println(stn.solution(a1, b1));
		
		int a2 = 3;
		int b2 = 3;
		System.out.println(stn.solution(a2, b2));
		
		int a3 = 5;
		int b3 = 3;
		System.out.println(stn.solution(a3, b3));
	}
	
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a == b) {
            answer = a;
        } else {
            for(int i=Math.min(a,b); i<=Math.max(a,b); i++) {
                answer += i;
            }
        }
        
        return answer;
    }

}
