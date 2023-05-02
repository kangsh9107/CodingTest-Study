package programmers0;

public class Substring {

	//프로그래머스 Level 0. 부분 문자열
	//https://school.programmers.co.kr/learn/courses/30/lessons/181842
	public static void main(String[] args) {
		Substring s = new Substring();
		
		String str1 = "abc";
		String str2 = "aabcc";
		System.out.println(s.solution(str1, str2));
		
//		String str3 = "tbt";
//		String str4 = "tbbttb";
//		System.out.println(s.solution(str3, str4));
	}

	private int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
	}

}
