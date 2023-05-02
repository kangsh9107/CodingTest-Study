package programmers0;

public class IntegerToString {

	//프로그래머스 Level 0. 문자열로 변환
	//https://school.programmers.co.kr/learn/courses/30/lessons/181845
	public static void main(String[] args) {
		IntegerToString its = new IntegerToString();
		
		int n1 = 123;
		System.out.println(its.solution(n1));
		
//		int n2 = 2573;
//		System.out.println(its.solution(n2));
	}

	private String solution(int n) {
        return Integer.toString(n);
	}

}
