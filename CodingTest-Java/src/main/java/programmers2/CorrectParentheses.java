package programmers2;

public class CorrectParentheses {

	//프로그래머스 Level 2. 올바른 괄호
	//https://school.programmers.co.kr/learn/courses/30/lessons/12909
	public static void main(String[] args) {
		CorrectParentheses cp = new CorrectParentheses();
		
//		String s1 = "()()";
//		System.out.println(cp.solution(s1));
//		
//		String s2 = "(())()";
//		System.out.println(cp.solution(s2));
		
		String s3 = ")()(";
		System.out.println(cp.solution(s3));
		
//		String s4 = "(()(";
//		System.out.println(cp.solution(s4));
	}
	
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.substring(i, i+1).equals("(")) cnt++;
            else cnt--;
            
            if(cnt < 0) break;
        }
        if(cnt != 0) answer = false;

        return answer;
    }

}
