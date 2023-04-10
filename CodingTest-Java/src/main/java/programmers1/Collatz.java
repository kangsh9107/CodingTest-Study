package programmers1;

public class Collatz {

	//프로그래머스 Level 1. 콜라츠 추측
	//https://school.programmers.co.kr/learn/courses/30/lessons/12943
	public static void main(String[] args) {
		Collatz cz = new Collatz();
		
		int n1 = 6;
		System.out.println(cz.solution(n1));
		
		int n2 = 16;
		System.out.println(cz.solution(n2));
		
		int n3 = 626331;
		System.out.println(cz.solution(n3));
	}
	
    public int solution(int num) {
		int answer = 0;
		long l = (long)num;
		
		while(answer < 500) {
			if(l == 1) break;
			answer++;
			if(answer == 500) {
				answer = -1;
				break;
			}
			
			if(l % 2 == 0) l = l / 2;
			else           l = (l * 3) + 1;
		}
		
		return answer;
    }

}
