package programmers0;

public class AntColony {

	//프로그래머스 Level 0. 개미 군단
	//https://school.programmers.co.kr/learn/courses/30/lessons/120837
	public static void main(String[] args) {
		AntColony ac = new AntColony();
		
		int hp1 = 23;
		System.out.println(ac.solution(hp1));
		
		int hp2 = 24;
		System.out.println(ac.solution(hp2));
		
		int hp3 = 999;
		System.out.println(ac.solution(hp3));
	}

	private int solution(int hp) {
        int answer = 0;
        answer += (int)(hp/5);
        answer += (int)((hp%5)/3);
        answer += ((hp%5)%3);
        return answer;
	}

}
