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
        int answer = 1;
        Stack<String> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
        	if(i == 0) {
        		stack.push(s.substring(i, i+1));
        	} else {
        		if(stack.get(stack.size()-1).equals(s.substring(i, i+1))) {
        			continue;
        		} else {
        			stack.push(s.substring(i, i+1));
        		}
        	}
        }
        if(stack.size() != 1) answer = 0;
        
        return answer;
    }

}
