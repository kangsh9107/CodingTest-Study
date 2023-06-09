package programmers0;

public class BehindString {

	//프로그래머스 Level 0. 문자열의 뒤의 n글자
	//https://school.programmers.co.kr/learn/courses/30/lessons/181910
	public static void main(String[] args) {
		BehindString bs = new BehindString();
		
		String my_string1 = "ProgrammerS123";
		int n1 = 11;
		System.out.println(bs.solution(my_string1, n1));
		
//		String my_string2 = "He110W0r1d";
//		int n2 = 5;
//		System.out.println(bs.solution(my_string2, n2));
	}

	private String solution(String my_string, int n) {
		return my_string.substring(my_string.length() - n);
	}

}
