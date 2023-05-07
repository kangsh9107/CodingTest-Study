package programmers0;

public class ReverseString {

	//프로그래머스 Level 0. 문자열 뒤집기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120822
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		
		String my_string1 = "jaron";
		System.out.println(rs.solution(my_string1));
		
		String my_string2 = "bread";
		System.out.println(rs.solution(my_string2));
	}

	private String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string).reverse();
        return answer.toString();
	}

}
