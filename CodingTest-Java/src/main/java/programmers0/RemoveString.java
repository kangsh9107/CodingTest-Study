package programmers0;

public class RemoveString {

	//프로그래머스 Level 0. 특정 문자 제거하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120826
	public static void main(String[] args) {
		RemoveString rs = new RemoveString();
		
		String my_string1 = "abcdef";
		String letter1 = "f";
		System.out.println(rs.solution(my_string1, letter1));
		
		String my_string2 = "BCBdbe";
		String letter2 = "B";
		System.out.println(rs.solution(my_string2, letter2));
	}
	
	public String solution(String my_string, String letter) {
		String[] splitMy_string = my_string.split("");
		StringBuilder answer = new StringBuilder();
		for(String s : splitMy_string) {
			if( !s.equals(letter) )  answer.append(s);
		}
		return answer.toString();
	}

}
