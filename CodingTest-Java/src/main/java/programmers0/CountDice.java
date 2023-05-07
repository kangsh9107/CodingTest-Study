package programmers0;

public class CountDice {

	//프로그래머스 Level 0. 주사위의 개수
	//https://school.programmers.co.kr/learn/courses/30/lessons/120845
	public static void main(String[] args) {
		CountDice cd = new CountDice();
		
		int[] box1 = {1, 1, 1};
		int n1 = 1;
		System.out.println(cd.solution(box1, n1));
		
		int[] box2 = {10, 8, 6};
		int n2 = 3;
		System.out.println(cd.solution(box2, n2));
	}

	private int solution(int[] box, int n) {
        return (int)(box[0]/n) * (int)(box[1]/n) * (int)(box[2]/n);
	}

}
