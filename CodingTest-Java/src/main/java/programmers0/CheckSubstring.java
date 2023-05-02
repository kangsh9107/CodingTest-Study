package programmers0;

public class CheckSubstring {

	//프로그래머스 Level 0. 부분 문자열인지 확인하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181843
	public static void main(String[] args) {
		CheckSubstring cs = new CheckSubstring();
		
		String my_string1 = "banana";
		String target1 = "ana";
		System.out.println(cs.solution(my_string1, target1));
		
//		String my_string2 = "banana";
//		String target2 = "wxyz";
//		System.out.println(cs.solution(my_string2, target2));
	}

	private int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
	}

}
