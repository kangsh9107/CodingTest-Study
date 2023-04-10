package programmers1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivideNumberArray {

	//프로그래머스 Level 1. 나누어 떨어지는 숫자 배열
	//https://school.programmers.co.kr/learn/courses/30/lessons/12910
	public static void main(String[] args) {
		DivideNumberArray dna = new DivideNumberArray();
		
		int[] arr1 = {5, 9, 7, 10};
		int divisor1 = 5;
		System.out.println(dna.solution(arr1, divisor1));
		
		int[] arr2 = {2, 36, 1, 3};
		int divisor2 = 1;
		System.out.println(dna.solution(arr2, divisor2));
		
		int[] arr3 = {3, 2, 6};
		int divisor3 = 10;
		System.out.println(dna.solution(arr3, divisor3));
	}
	
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) answer.add(arr[i]);
        }
        Collections.sort(answer);
        if(answer.size() == 0) answer.add(-1);
        
        return answer;
    }

}
