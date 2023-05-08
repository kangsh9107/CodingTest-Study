package programmers0;

public class ThreeSixNineGame {

	//프로그래머스 Level 0. 369게임
	//https://school.programmers.co.kr/learn/courses/30/lessons/120891
	public static void main(String[] args) {
		ThreeSixNineGame tsng = new ThreeSixNineGame();
		
		int order1 = 3;
		System.out.println(tsng.solution(order1));
		
		int order2 = 29423;
		System.out.println(tsng.solution(order2));
	}

	private int solution(int order) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(order);
        String[] splitOrder = sb.toString().split("");
        for(String s : splitOrder) {
            if(s.equals("3") || s.equals("6") || s.equals("9")) answer++;
        }
        return answer;
	}

}
