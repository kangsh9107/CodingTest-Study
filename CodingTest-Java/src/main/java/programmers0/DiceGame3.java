package programmers0;

import java.util.HashMap;
import java.util.Map;

public class DiceGame3 {

	/*
	 * 프로그래머스 Level 0. 주사위 게임 3
	 * https://school.programmers.co.kr/learn/courses/30/lessons/181916
	 *
	 * 생성일 : 2023-06-26
	 * 완료일 : 2023-06-
	 */
	public static void main(String[] args) {
		DiceGame3 dg = new DiceGame3();
		
//		int a1 = 2;
//		int b1 = 2;
//		int c1 = 2;
//		int d1 = 2;
//		System.out.println(dg.solution(a1, b1, c1, d1));
//		
//		int a2 = 4;
//		int b2 = 1;
//		int c2 = 4;
//		int d2 = 4;
//		System.out.println(dg.solution(a2, b2, c2, d2));
//		
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
		
		int a5 = 6;
		int b5 = 4;
		int c5 = 2;
		int d5 = 5;
		System.out.println(dg.solution(a5, b5, c5, d5));
	}

	private int solution(int a, int b, int c, int d) {
		int[] nums = new int[4];
		nums[0] = a;
		nums[0] = b;
		nums[0] = c;
		nums[0] = d;

		Map<Integer, Integer> hm = new HashMap<>();
		for (int i=0; i<nums.length; i++) {
			if (hm.get(nums[i]) == null) {
				hm.put(nums[i], 1);
			} else {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			}
		}

		int answer = 0;
		int p = 0;
		int q = 0;
		int cntDup = 0;
		for (int key : hm.keySet()) {
			cntDup = Math.max(cntDup, hm.get(key));
		}


		if (cntDup == 1) {

		} else if (cntDup == 2) {

		} else if (cntDup == 3) {

		} else if (cntDup == 4) {

		}

		return answer;
	}

	private void repeat(Map<Integer, Integer> hm, int cntDup) {
		for (int key : hm.keySet()) {

		}
	}

}
