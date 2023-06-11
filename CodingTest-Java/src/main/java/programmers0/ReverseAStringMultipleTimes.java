package programmers0;

public class ReverseAStringMultipleTimes {

	//프로그래머스 Level 0. 문자열 여러 번 뒤집기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181913
	public static void main(String[] args) {
		ReverseAStringMultipleTimes rasmt = new ReverseAStringMultipleTimes();
		
		String my_string1 = "rermgorpsam";
		int[][] queries1 = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		System.out.println(rasmt.solution(my_string1, queries1));
	}

	private String solution(String my_string, int[][] queries) {
		StringBuilder reverse = new StringBuilder();
		
		for (int i=0; i<queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1] + 1;
			String prefix = my_string.substring(0, start);
			String suffix = my_string.substring(end);
			
			reverse.setLength(0);
			reverse.append(my_string.substring(start, end));
			reverse.reverse();
			
			my_string = prefix + reverse.toString() + suffix;
		}
		
		return my_string;
	}

}
