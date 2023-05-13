package programmers0;

public class FindString {

	//프로그래머스 Level 0. 원하는 문자열 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181878
	public static void main(String[] args) {
		FindString fs = new FindString();
		
		String myString1 = "AbCdEfG";
		String pat1 = "aBc";
		System.out.println(fs.solution(myString1, pat1));
		
//		String myString2 = "aaAA";
//		String pat2 = "aaaaa";
//		System.out.println(fs.solution(myString2, pat2));
	}

	private int solution(String myString, String pat) {
		return myString.toUpperCase().contains(pat.toUpperCase()) == true ? 1 : 0;
	}

}
