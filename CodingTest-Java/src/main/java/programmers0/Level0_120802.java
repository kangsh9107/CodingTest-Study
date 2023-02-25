package programmers0;

public class Level0_120802 {

	//프로그래머스 Level 0. 두 수의 합
	//https://school.programmers.co.kr/learn/courses/30/lessons/120802
	public static void main(String[] args) {
		Level0_120802 l120802 = new Level0_120802();
		
		int num1 = 2;
		int num2 = 3;
		System.out.println(l120802.solution(num1, num2));
		
		int num3 = 2;
		int num4 = 3;
		System.out.println(l120802.solution(num3, num4));
	}
	
    public int solution(int num1, int num2) {
        return num1 + num2;
    }

}
