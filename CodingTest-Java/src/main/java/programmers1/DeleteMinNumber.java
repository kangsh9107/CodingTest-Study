package programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteMinNumber {

	//프로그래머스 Level 1. 제일 작은 수 제거하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12935
	public static void main(String[] args) {
		DeleteMinNumber dmn = new DeleteMinNumber();
		
		int[] arr1 = {4,3,2,1};
		System.out.println(dmn.solution(arr1));
		
		int[] arr2 = {10};
		System.out.println(dmn.solution(arr2));
	}
	
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        if(arr.length < 2) answer.add(-1);
        
        for(int i=0; i<arr.length; i++) {
            answer.add(arr[i]);
        }
        Arrays.sort(arr);
        Integer index = arr[0];
        answer.remove(index);
        
        return answer;
    }

}
