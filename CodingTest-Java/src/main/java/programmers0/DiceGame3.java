package programmers0;

import java.util.*;

public class DiceGame3 {

	/*
	 * 프로그래머스 Level 0. 주사위 게임 3
	 * https://school.programmers.co.kr/learn/courses/30/lessons/181916
	 *
	 * 생성일 : 2023-06-26
	 * 완료일 : 2023-07-02
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
		List<Integer> dice = Arrays.asList(a, b, c, d);
		Map<Integer, Integer> frequency = new HashMap<>();
		for (int num : dice) {
			frequency.put(num, frequency.getOrDefault(num, 0) + 1);
		}

		int answer = 0;
		int p = 0;
		int q = 0;
		int r = 0;
		int cnt = 0;
		if (frequency.size() == 1) {
			for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
				p = entry.getKey();
				answer = 1111 * p;
			}
		} else if (frequency.size() == 2) {
			for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
				cnt = Math.max(cnt, entry.getValue());
			}

			if (cnt == 3) {
				for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
					if (entry.getValue() == 3) {
						p = entry.getKey();
					} else {
						q = entry.getKey();
					}
				}
				answer = (int) Math.pow((10 * p) + q, 2);
			} else {
				for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
					if (p == 0) {
						p = entry.getKey();
					} else if (p != 0 && p != entry.getKey()) {
						q = entry.getKey();
					}
				}
				answer = (p + q) * Math.abs(p - q);
			}
		} else if (frequency.size() == 3) {
			for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
				if (entry.getValue() == 1) {
					if (q == 0) {
						q = entry.getKey();
					} else {
						r = entry.getKey();
					}
				}
			}
			answer = q * r;
		} else {
			answer = Collections.min(dice);
		}

		return answer;
	}

}
