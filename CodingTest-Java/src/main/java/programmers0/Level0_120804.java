package programmers0;

public class Level0_120804 {

	//프로그래머스 Level 0. 두 수의 곱
	//https://school.programmers.co.kr/learn/courses/30/lessons/120804
	public static void main(String[] args) {
		Level0_120804 l120804 = new Level0_120804();
		
		int num1 = 3;
		int num2 = 4;
		System.out.println(l120804.solution(num1, num2));
		
		int num3 = 27;
		int num4 = 19;
		System.out.println(l120804.solution(num3, num4));
	}
	
    public int solution(int num1, int num2) {
        return num1 * num2;
    }

}
