package programmers0;

public class StringToInteger {

	//프로그래머스 Level 0. 문자열을 정수로 변환하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181848
	public static void main(String[] args) {
		StringToInteger sti = new StringToInteger();
		
		String n_str1 = "10";
		System.out.println(sti.solution(n_str1));
		
//		String n_str2 = "8542";
//		System.out.println(sti.solution(n_str2));
	}

	private int solution(String n_str) {
        return Integer.parseInt(n_str);
	}

}
