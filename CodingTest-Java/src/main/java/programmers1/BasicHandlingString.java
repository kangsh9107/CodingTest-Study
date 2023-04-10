package programmers1;

public class BasicHandlingString {

	//프로그래머스 Level 1. 문자열 다루기 기본
	//https://school.programmers.co.kr/learn/courses/30/lessons/12918
	public static void main(String[] args) {
		BasicHandlingString bhs = new BasicHandlingString();
		
		String s1 = "a234";
		System.out.println(bhs.solution(s1));
		
		String s2 = "1234";
		System.out.println(bhs.solution(s2));
	}
	
    public boolean solution(String s) {
        boolean answer = true;
        
        try {
            if(s.length() == 4  || s.length() == 6) {
			    int l = Integer.parseInt(s);
            } else {
                answer = false;
            }
		} catch(Throwable e) {
            answer = false;
		}
        
        return answer;
    }

}
