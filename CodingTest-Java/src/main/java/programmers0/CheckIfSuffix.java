package programmers0;

public class CheckIfSuffix {

	//프로그래머스 Level 0. 접미사인지 확인하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181908
	public static void main(String[] args) {
		CheckIfSuffix cis = new CheckIfSuffix();
		
		String my_string1 = "banana";
		String is_suffix1 = "ana";
		System.out.println(cis.solution(my_string1, is_suffix1));
		
//		String my_string2 = "banana";
//		String is_suffix2 = "nan";
//		System.out.println(cis.solution(my_string2, is_suffix2));
//		
//		String my_string3 = "banana";
//		String is_suffix3 = "wxyz";
//		System.out.println(cis.solution(my_string3, is_suffix3));
//		
//		String my_string4 = "banana";
//		String is_suffix4 = "abanana";
//		System.out.println(cis.solution(my_string4, is_suffix4));
	}

	private int solution(String my_string, String is_suffix) {
		return my_string.endsWith(is_suffix) ? 1 : 0;
	}

}
