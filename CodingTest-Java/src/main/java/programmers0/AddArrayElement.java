package programmers0;

import java.util.Stack;

public class AddArrayElement {

	//프로그래머스 Level 0. 배열의 원소만큼 추가하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181861
	public static void main(String[] args) {
		AddArrayElement ae = new AddArrayElement();
		
		int[] arr1 = {5, 1, 4};
		System.out.println(ae.solution(arr1));
		
//		int[] arr2 = {6, 6};
//		System.out.println(ae.solution(arr2));
//		
//		int[] arr3 = {1};
//		System.out.println(ae.solution(arr3));
	}

	private Stack<Integer> solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]; j++) {
				stack.push(arr[i]);
			}
		}
		
		return stack;
	}

}
