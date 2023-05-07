package programmers0;

public class RepeatPrintString {

	//프로그래머스 Level 0. 문자 반복 출력하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120825
	public static void main(String[] args) {
		RepeatPrintString rps = new RepeatPrintString();
		
		String my_string1 = "hello";
		int n1 = 3;
		System.out.println(rps.solution(my_string1, n1));
	}

	private String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        String[] splitMy_string = my_string.split("");
        for(String s : splitMy_string) {
            for(int i=0; i<n; i++) {
                answer.append(s);
            }
        }
        return answer.toString();
	}

}
