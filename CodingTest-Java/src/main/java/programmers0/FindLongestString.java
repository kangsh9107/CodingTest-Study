package programmers0;

public class FindLongestString {

	//프로그래머스 Level 0. 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181872
	public static void main(String[] args) {
		FindLongestString fls = new FindLongestString();
		
		String myString1 = "AbCdEFG";
		String pat1 = "dE";
		System.out.println(fls.solution(myString1, pat1));
		
//		String myString2 = "AAAAaaaa";
//		String pat2 = "a";
//		System.out.println(fls.solution(myString2, pat2));
	}

	private String solution(String myString, String pat) {
        int lastIndex = myString.lastIndexOf(pat) + pat.length();
        return myString.substring(0, lastIndex);
	}

}
