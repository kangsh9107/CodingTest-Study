package programmers0;

public class FindTheLocationOfAPoint {

	//프로그래머스 Level 0. 점의 위치 구하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120841
	public static void main(String[] args) {
		FindTheLocationOfAPoint ftloap = new FindTheLocationOfAPoint();
		
		int[] dot1 = {2, 4};
		System.out.println(ftloap.solution(dot1));
		
		int[] dot2 = {-7, 9};
		System.out.println(ftloap.solution(dot2));
	}

	private int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0) answer = 1;
        else if(dot[0] < 0 && dot[1] > 0) answer = 2;
        else if(dot[0] < 0 && dot[1] < 0) answer = 3;
        else answer = 4;
        return answer;
	}

}
