package programmers0;

import java.util.Stack;

public class MakeArray4 {

	//프로그래머스 Level 0. 배열 만들기 4
	//https://school.programmers.co.kr/learn/courses/30/lessons/181918
	public static void main(String[] args) {
		MakeArray4 ma = new MakeArray4();
		
		int[] arr1 = {1, 4, 2, 5, 3};
		System.out.println(ma.solution(arr1));
	}

	private Stack<Integer> solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		
		for (int i=0; i<arr.length; i++) {
			if (stack.empty()) {
				stack.push(arr[i]);
			} else if (stack.peek() < arr[i]) {
				stack.push(arr[i]);
			} else {
				stack.pop();
				i--;
			}
		}
		
		return stack;
	}

}
