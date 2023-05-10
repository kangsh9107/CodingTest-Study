package programmers0;

import java.util.Stack;

public class NumberBetweenX {

	//프로그래머스 Level 0. x 사이의 개수
	//https://school.programmers.co.kr/learn/courses/30/lessons/181867
	public static void main(String[] args) {
		NumberBetweenX nbx = new NumberBetweenX();
		
		String myString1 = "oxooxoxxox";
		System.out.println(nbx.solution(myString1));
		
		String myString2 = "xabcxdefxghi";
		System.out.println(nbx.solution(myString2));
	}

	private Stack<Integer> solution(String myString) {
        int len = myString.length();
        String last = myString.substring(len - 1);
        String[] split = myString.split("x");
        
        Stack<Integer> answer = new Stack<>();
        for(int i=0; i<split.length; i++) {
            answer.push(split[i].length());
        }
        if(last.equals("x")) answer.push(0);
        
        return answer;
	}

}
