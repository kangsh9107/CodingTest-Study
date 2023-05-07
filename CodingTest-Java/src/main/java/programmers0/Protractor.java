package programmers0;

public class Protractor {

	//프로그래머스 Level 0. 각도기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120829
	public static void main(String[] args) {
		Protractor p = new Protractor();
		
		int angle1 = 70;
		System.out.println(p.solution(angle1));
		
		int angle2 = 91;
		System.out.println(p.solution(angle2));
		
		int angle3 = 180;
		System.out.println(p.solution(angle3));
	}

	private int solution(int angle) {
        int answer = 0;
        if(angle == 180) answer = 4;
        else if(angle > 90) answer = 3;
        else if(angle == 90) answer = 2;
        else answer = 1;
        return answer;
	}

}
