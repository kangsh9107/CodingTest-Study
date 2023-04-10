package programmers1;

public class SquareRoot {

	//프로그래머스 Level 1. 정수 제곱근 판별
	//https://school.programmers.co.kr/learn/courses/30/lessons/12934
	public static void main(String[] args) {
		SquareRoot sr = new SquareRoot();
		
		int n1 = 121;
		System.out.println(sr.solution(n1));
		
		int n2 = 3;
		System.out.println(sr.solution(n2));
	}
	
    public long solution(long n) {
        long answer = 0;
        
        if( Math.sqrt(n) == (int)(Math.sqrt(n)) ) {
            answer = (long)((Math.sqrt(n)+1) * (Math.sqrt(n)+1));
        } else {
            answer = -1;
        }
        
        return answer;
    }

}
