package programmers0;

import java.util.Stack;

public class EmptyArray {

	//프로그래머스 Level 0. 빈 배열에 추가, 삭제하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181860
	public static void main(String[] args) {
		EmptyArray ea = new EmptyArray();
		
		int[] arr1 = {3, 2, 4, 1, 3};
		boolean[] flag1 = {true, false, true, false, false};
		System.out.println(ea.solution(arr1, flag1));
	}

	private Stack<Integer> solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(flag[i]) {
                for(int j=0; j<arr[i]*2; j++) {
                    stack.push(arr[i]);
                }
            } else {
                for(int j=0; j<arr[i]; j++) {
                    stack.pop();
                }
            }
        }
        
        return stack;
	}

}
