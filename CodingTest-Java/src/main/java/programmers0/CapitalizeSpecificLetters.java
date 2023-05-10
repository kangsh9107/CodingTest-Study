package programmers0;

public class CapitalizeSpecificLetters {

	//프로그래머스 Level 0. 특정한 문자를 대문자로 바꾸기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181873
	public static void main(String[] args) {
		CapitalizeSpecificLetters csl = new CapitalizeSpecificLetters();
		
		String my_string1 = "programmers";
		String alp1 = "p";
		System.out.println(csl.solution(my_string1, alp1));
		
		String my_string2 = "lowercase";
		String alp2 = "x";
		System.out.println(csl.solution(my_string2, alp2));
	}

	private String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        String[] split = my_string.split("");
        for(String s : split) {
            if(s.equals(alp)) answer.append(s.toUpperCase());
            else answer.append(s);
        }
        return answer.toString();
	}

}
