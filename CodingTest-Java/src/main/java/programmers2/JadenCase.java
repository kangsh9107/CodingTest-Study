package programmers2;

public class JadenCase {

	//프로그래머스 Level 2. JadenCase 문자열 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12951
	public static void main(String[] args) {
		JadenCase jc = new JadenCase();
		
//		String s1 = "3people unFollowed me";
//		System.out.println(jc.solution(s1));
//		
//		String s2 = "for the last week";
//		System.out.println(jc.solution(s2));
		
		String s3 = "for the  last week";
		System.out.println(jc.solution(s3));
	}
	
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
        	if(s.substring(i, i+1).equals(" ")) {
        		cnt = 0;
        		answer.append(" ");
        	} else if(cnt == 0) {
        		cnt++;
        		answer.append(s.substring(i, i+1).toUpperCase());
        	} else {
        		answer.append(s.substring(i, i+1).toLowerCase());
        	}
        }
        
        return answer.toString();
    }

}
