package programmers0;

public class RnyString {

	//프로그래머스 Level 0. rny_string
	//https://school.programmers.co.kr/learn/courses/30/lessons/181863
	public static void main(String[] args) {
		RnyString rs = new RnyString();
		
		String rny_string1 = "masterpiece";
		System.out.println(rs.solution(rny_string1));
		
//		String rny_string2 = "programmers";
//		System.out.println(rs.solution(rny_string2));
//		
//		String rny_string3 = "jerry";
//		System.out.println(rs.solution(rny_string3));
//		
//		String rny_string4 = "burn";
//		System.out.println(rs.solution(rny_string4));
	}

	private String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
	}

}
