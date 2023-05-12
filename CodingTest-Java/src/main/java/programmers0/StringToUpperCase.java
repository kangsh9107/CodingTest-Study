package programmers0;

public class StringToUpperCase {

	//프로그래머스 Level 0. 대문자로 바꾸기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181877
	public static void main(String[] args) {
		StringToUpperCase stuc = new StringToUpperCase();
		
		String myString1 = "aBcDeFg";
		System.out.println(stuc.solution(myString1));
		
		String myString2 = "AAA";
		System.out.println(stuc.solution(myString2));
	}

	private String solution(String myString) {
        return myString.toUpperCase();
	}

}
