package programmers0;

public class BasicReverseString {

	//프로그래머스 Level 0. 문자열 뒤집기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181905
	public static void main(String[] args) {
		BasicReverseString brs = new BasicReverseString();
		
		String my_string1 = "Progra21Sremm3";
		int s1 = 6;
		int e1 = 12;
		System.out.println(brs.solution(my_string1, s1, e1));
		
//		String my_string2 = "Stanley1yelnatS";
//		int s2 = 4;
//		int e2 = 10;
//		System.out.println(brs.solution(my_string2, s2, e2));
	}

	private String solution(String my_string, int s, int e) {
		StringBuilder sb = new StringBuilder();
		String first = my_string.substring(0, s);
		String middle = sb.append(my_string.substring(s, e + 1)).reverse().toString();
		String last = my_string.substring(e + 1);
		return first + middle + last;
	}

}
