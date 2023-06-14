package programmers0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.SupportedSourceVersion;

public class DiceGame3 {

	//프로그래머스 Level 0. 주사위 게임 3
	//https://school.programmers.co.kr/learn/courses/30/lessons/181916
	public static void main(String[] args) {
		DiceGame3 dg = new DiceGame3();
		
//		int a1 = 2;
//		int b1 = 2;
//		int c1 = 2;
//		int d1 = 2;
//		System.out.println(dg.solution(a1, b1, c1, d1));
		
		int a2 = 4;
		int b2 = 1;
		int c2 = 4;
		int d2 = 4;
		System.out.println(dg.solution(a2, b2, c2, d2));
		
//		int a3 = 6;
//		int b3 = 3;
//		int c3 = 3;
//		int d3 = 6;
//		System.out.println(dg.solution(a3, b3, c3, d3));
//		
//		int a4 = 2;
//		int b4 = 5;
//		int c4 = 2;
//		int d4 = 6;
//		System.out.println(dg.solution(a4, b4, c4, d4));
//		
//		int a5 = 6;
//		int b5 = 4;
//		int c5 = 2;
//		int d5 = 5;
//		System.out.println(dg.solution(a5, b5, c5, d5));
	}

	private int solution(int a, int b, int c, int d) {
		int answer = 0;
		int[] nums = new int[4];
		nums[0] = a;
		nums[1] = b;
		nums[2] = c;
		nums[3] = d;
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i=0; i<nums.length; i++) {
			if (hm.get(nums[i]) == null) {
				hm.put(nums[i], 1);
			} else {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			}
		}
		
		List<Integer> isDup = new ArrayList<>();
		List<Integer> isNotDup = new ArrayList<>();
		int min = 0;
		for (int key : hm.keySet()) {
			min = Math.min(hm.get(key), min);
			
			if (hm.get(key) != 1) {
				isDup.add(key);
			} else {
				isNotDup.add(key);
			}
		}
		
		if (hm.size() == 1) {
			answer = 1111 * isDup.get(0);
		} else if (hm.size() == 2 && isDup.size() == 1) {
			answer = (int) Math.pow(10 * isDup.get(0) + isNotDup.get(0), 2);
		} else if (hm.size() == 2 && isDup.size() == 2) {
			answer = (isDup.get(0) + isDup.get(1)) * Math.abs(isDup.get(0) - isDup.get(1));
		} else if (hm.size() == 3) {
			answer = isNotDup.get(0) * isNotDup.get(1);
		} else {
			answer = min;
		}
		
		return answer;
	}

}
