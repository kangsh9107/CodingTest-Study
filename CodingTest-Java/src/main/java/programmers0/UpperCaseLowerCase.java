package programmers0;

public class UpperCaseLowerCase {

	//프로그래머스 Level 0. 대문자와 소문자
	//https://school.programmers.co.kr/learn/courses/30/lessons/120893
	public static void main(String[] args) {
		UpperCaseLowerCase uclc = new UpperCaseLowerCase();
		
		String my_string1 = "cccCCC";
		System.out.println(uclc.solution(my_string1));
		
		String my_string2 = "abCdEfghIJ";
		System.out.println(uclc.solution(my_string2));
	}
	
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();
        String[] spiltMy_string = my_string.split("");
        for(String s : spiltMy_string) {
        	if(s.toUpperCase().equals(s)) answer.append(s.toLowerCase());
        	else                          answer.append(s.toUpperCase());
        }
		return answer.toString();
	}

}
