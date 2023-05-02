package programmers0;

public class PlusString {

	//프로그래머스 Level 0. 문자열 정수의 합
	//https://school.programmers.co.kr/learn/courses/30/lessons/181849
	public static void main(String[] args) {
		PlusString ps = new PlusString();
		
		String num_str1 = "123456789";
		System.out.println(ps.solution(num_str1));
		
//		String num_str2 = "1000000";
//		System.out.println(ps.solution(num_str2));
	}

	private int solution(String num_str) {
        int answer = 0;
        for(int i=0; i<num_str.length(); i++) {
            answer += Integer.parseInt(num_str.substring(i, i + 1));
        }
        return answer;
	}

}
