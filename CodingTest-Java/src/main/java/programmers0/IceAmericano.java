package programmers0;

public class IceAmericano {

	//프로그래머스 Level 0. 아이스 아메리카노
	//https://school.programmers.co.kr/learn/courses/30/lessons/120819
	public static void main(String[] args) {
		IceAmericano ia = new IceAmericano();
		
		int money1 = 5500;
		System.out.println(ia.solution(money1));
		
		int money2 = 15000;
		System.out.println(ia.solution(money2));
	}

	private int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = (int)(money/5500);
        answer[1] = money % 5500;
        return answer;
	}

}
