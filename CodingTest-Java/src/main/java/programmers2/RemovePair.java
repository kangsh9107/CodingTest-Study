package programmers2;

import java.util.Stack;

public class RemovePair {

	//프로그래머스 Level 2. 짝지어 제거하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12973
	public static void main(String[] args) {
		RemovePair rp = new RemovePair();
		
		String s1 = "baabaa";
		System.out.println(rp.solution(s1));
		
		String s2 = "cdcd";
		System.out.println(rp.solution(s2));
	}
	
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
        	char ch = s.charAt(i);
        	if( !stack.isEmpty() && stack.peek() == ch ) stack.pop();
        	else stack.push(ch);
        }
        
        return stack.isEmpty() ? 1 : 0;
    }

}
