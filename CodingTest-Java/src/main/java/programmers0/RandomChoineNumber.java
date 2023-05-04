package programmers0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomChoineNumber {

	//프로그래머스 Level 0. 무작위로 K개의 수 뽑기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181858
	public static void main(String[] args) {
		RandomChoineNumber rcn = new RandomChoineNumber();
		
		int[] arr1 = {0, 1, 1, 2, 2, 3};
		int k1 = 3;
		System.out.println(rcn.solution(arr1, k1));
		
//		int[] arr2 = {0, 1, 1, 1, 1};
//		int k2 = 4;
//		System.out.println(rcn.solution(arr2, k2));
	}

	private List<Integer> solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(hs.add(arr[i]) && answer.size() < k) answer.add(arr[i]);
        }
        while(answer.size() < k) {
            answer.add(-1);
        }
        
        return answer;
	}

}
