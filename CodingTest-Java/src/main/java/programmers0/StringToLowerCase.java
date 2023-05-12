package programmers0;

public class StringToLowerCase {

	//프로그래머스 Level 0. 소문자로 바꾸기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181876
	public static void main(String[] args) {
		StringToLowerCase stlc = new StringToLowerCase();
		
		String myString1 = "aBcDeFg";
		System.out.println(stlc.solution(myString1));
		
		String myString2 = "aaa";
		System.out.println(stlc.solution(myString2));
	}

	private String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for(String s : myString.split("")) {
            answer.append(s.toLowerCase());
        }
        return answer.toString();
	}

}
