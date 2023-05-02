package programmers0;

public class FloatToInteger {

	//프로그래머스 Level 0. 정수 부분
	//https://school.programmers.co.kr/learn/courses/30/lessons/181850
	public static void main(String[] args) {
		FloatToInteger fti = new FloatToInteger();
		
		float flo1 = 1.42f;
		System.out.println(fti.solution(flo1));
		
//		float flo2 = 69.32f;
//		System.out.println(fti.solution(flo2));
	}

	private int solution(float flo) {
        return (int) flo;
	}

}
