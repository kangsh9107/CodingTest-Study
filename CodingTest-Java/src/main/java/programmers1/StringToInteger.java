package programmers1;

public class StringToInteger {

	//프로그래머스 Level 1. 문자열을 정수로 바꾸기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12925
	public static void main(String[] args) {
		StringToInteger sti = new StringToInteger();
		
		String s1 = "1234";
		System.out.println(sti.solution(s1));
		
		String s2 = "-1234";
		System.out.println(sti.solution(s1));
	}
	
    public int solution(String s) {
        int answer = 0;
        
        answer = Integer.parseInt(s);
        
        return answer;
    }

}
