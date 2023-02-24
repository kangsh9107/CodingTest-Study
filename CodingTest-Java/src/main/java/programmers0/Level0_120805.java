package programmers0;

public class Level0_120805 {

	//프로그래머스 Level 0. 몫 구하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120805
	public static void main(String[] args) {
		Level0_120805 l120805 = new Level0_120805();
		
		int num1 = 10;
		int num2 = 5;
		System.out.println(l120805.solution(num1, num2));
		
		int num3 = 7;
		int num4 = 2;
		System.out.println(l120805.solution(num3, num4));
	}

    public int solution(int num1, int num2) {
        return (int)(num1/num2);
    }
    
}
