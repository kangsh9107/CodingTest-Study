package programmers1;

public class EvenOdd {

	//프로그래머스 Level 1. 짝수와 홀수
	//https://school.programmers.co.kr/learn/courses/30/lessons/12937
	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		
		int num1 = 3;
		System.out.println(eo.solution(num1));
		
		int num2 = 4;
		System.out.println(eo.solution(num2));
	}
	
    public String solution(int num) {
        StringBuilder sb = new StringBuilder();
        
        if(num % 2 == 0) sb.append("Even");
        else             sb.append("Odd");
        
        return sb.toString();
    }

}
