package programmers0;

public class ConcatenateSubstringsToCreateAString {

	//프로그래머스 Level 0. 부분 문자열 이어 붙여 문자열 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181911
	public static void main(String[] args) {
		ConcatenateSubstringsToCreateAString cstcas = new ConcatenateSubstringsToCreateAString();
		
		String[] my_strings1 = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts1 = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		System.out.println(cstcas.solution(my_strings1, parts1));
	}

	private String solution(String[] my_strings, int[][] parts) {
		StringBuilder answer = new StringBuilder();
		
		for (int i=0; i<parts.length; i++) {
			answer.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
		}
		
		return answer.toString();
	}

}
