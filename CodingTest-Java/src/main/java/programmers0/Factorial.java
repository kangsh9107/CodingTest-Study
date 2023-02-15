package programmers0;

public class Factorial {

	//프로그래머스 Level 0. 팩토리얼
	//https://school.programmers.co.kr/learn/courses/30/lessons/120848
	public static void main(String[] args) {
		Factorial ft = new Factorial();
		
		int n1 = 3628800;
		System.out.println(ft.solution(n1));
		
		int n2 = 7;
		System.out.println(ft.solution(n2));
	}
	
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        for(int i=2; i<=n; i++) {
            factorial *= i;
            if(factorial > n) {
            	answer = i-1;
            	break;
            }
        }
        return answer;
    }

}
