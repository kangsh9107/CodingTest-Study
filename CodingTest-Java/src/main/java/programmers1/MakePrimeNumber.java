package programmers1;

import java.util.ArrayList;
import java.util.List;

public class MakePrimeNumber {

	//프로그래머스 Level 1. 소수 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12977
	public static void main(String[] args) {
		MakePrimeNumber mpn = new MakePrimeNumber();
		
//		int[] nums1 = {1,2,3,4};
//		System.out.println(mpn.solution(nums1));
		
		int[] nums2 = {1,2,7,6,4};
		System.out.println(mpn.solution(nums2));
	}
	
	static List<Integer> candidatePrimeNumber = new ArrayList<>();
	public int solution(int[] nums) {
		int answer = 0;
		int n = nums.length;
		int r = 3;
		boolean[] visited = new boolean[n];
		combination(nums, visited, 0, n, r);
		int cnt = 0;
		for(int i=0; i<candidatePrimeNumber.size(); i++) {
			cnt = 0;
			if(candidatePrimeNumber.get(i) < 2) {
				continue;
			} else if(candidatePrimeNumber.get(i) == 2) {
				answer++;
				continue;
			}
			for(int j=2; j<=Math.sqrt(candidatePrimeNumber.get(i)); j++) {
				if(candidatePrimeNumber.get(i) % j == 0) cnt++;
			}
			if(cnt == 0) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void combination(int[] nums, boolean[] visited, int start, int n, int r) {
		if(r == 0) {
			sum(nums, visited, n);
			return;
		}
		
		for(int i=start; i<n; i++) {
			visited[i] = true;
			combination(nums, visited, i+1, n, r-1);
			visited[i] = false;
		}
	}
	
	public static void sum(int[] nums, boolean[] visited, int n) {
		int temp = 0;
		for(int i=0; i<n; i++) {
			if(visited[i]) {
				temp += nums[i];
			}
		}
		candidatePrimeNumber.add(temp);
	}

}
