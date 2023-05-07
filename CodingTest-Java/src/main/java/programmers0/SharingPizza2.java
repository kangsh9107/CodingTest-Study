package programmers0;

public class SharingPizza2 {

	//프로그래머스 Level 0. 피자 나눠 먹기 (2)
	//https://school.programmers.co.kr/learn/courses/30/lessons/120815
	public static void main(String[] args) {
		SharingPizza2 sp = new SharingPizza2();
		
		int n1 = 6;
		System.out.println(sp.solution(n1));
		
		int n2 = 10;
		System.out.println(sp.solution(n2));
		
		int n3 = 4;
		System.out.println(sp.solution(n3));
	}

	private int solution(int n) {
        int answer = 0;
        for(int i=1; i<=600; i++) {
            if((i*6) % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
	}

}
