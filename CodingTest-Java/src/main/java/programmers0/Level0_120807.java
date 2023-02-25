package programmers0;

public class Level0_120807 {

	
	//프로그래머스 Level 0. 숫자 비교하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120807
	public static void main(String[] args) {
		Level0_120807 l120807 = new Level0_120807();
		
		int num1 = 2;
		int num2 = 3;
		System.out.println(l120807.solution(num1, num2));
		
		int num3 = 11;
		int num4 = 11;
		System.out.println(l120807.solution(num3, num4));
		
		int num5 = 7;
		int num6 = 99;
		System.out.println(l120807.solution(num5, num6));
	}
	
    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

}
