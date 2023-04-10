package programmers1;

import java.util.HashSet;
import java.util.Set;

public class Poketmon {

	//프로그래머스 Level 1. 폰켓몬
	//https://school.programmers.co.kr/learn/courses/30/lessons/1845
	public static void main(String[] args) {
		Poketmon pm = new Poketmon();
		
		int[] nums1 = {3,1,2,3};
		System.out.println(pm.solution(nums1));
		
		int[] nums2 = {3,3,3,2,2,4};
		System.out.println(pm.solution(nums2));
		
		int[] nums3 = {3,3,3,2,2,2};
		System.out.println(pm.solution(nums3));
	}
	
	public int solution(int[] nums) {
		int answer = 0;
		Set<Integer> hs = new HashSet<>();
		for(int n : nums) {
			hs.add(n);
		}
		if(hs.size() > nums.length/2) answer = nums.length/2;
		else                          answer = hs.size();
		return answer;
	}

}
