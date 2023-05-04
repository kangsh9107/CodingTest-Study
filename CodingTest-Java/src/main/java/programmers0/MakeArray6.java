package programmers0;

import java.util.Stack;

public class MakeArray6 {

	//프로그래머스 Level 0. 배열 만들기6
	//https://school.programmers.co.kr/learn/courses/30/lessons/181859
	public static void main(String[] args) {
		MakeArray6 ma = new MakeArray6();
		
		int[] arr1 = {0, 1, 1, 1, 0};
		System.out.println(ma.solution(arr1));
		
//		int[] arr2 = {0, 1, 0, 1, 0};
//		System.out.println(ma.solution(arr2));
//		
//		int[] arr3 = {0, 1, 1, 0};
//		System.out.println(ma.solution(arr3));
	}

	private Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(stack.empty()) {
                stack.push(arr[i]);
            } else if(stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        if(stack.empty()) {
            stack.push(-1);
        }
        return stack;
	}

}
