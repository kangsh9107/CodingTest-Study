package programmers0;

import java.util.HashSet;
import java.util.Set;

public class DiceGame3 {

	//프로그래머스 Level 0. 주사위 게임 3
	//https://school.programmers.co.kr/learn/courses/30/lessons/181916
	public static void main(String[] args) {
		DiceGame3 dg = new DiceGame3();
		
		int a1 = 2;
		int b1 = 2;
		int c1 = 2;
		int d1 = 2;
		System.out.println(dg.solution(a1, b1, c1, d1));
		
//		int a2 = 2;
//		int b2 = 2;
//		int c2 = 2;
//		int d2 = 2;
//		System.out.println(dg.solution(a2, b2, c2, d2));
//		
//		int a3 = 2;
//		int b3 = 2;
//		int c3 = 2;
//		int d3 = 2;
//		System.out.println(dg.solution(a3, b3, c3, d3));
//		
//		int a4 = 2;
//		int b4 = 2;
//		int c4 = 2;
//		int d4 = 2;
//		System.out.println(dg.solution(a4, b4, c4, d4));
//		
//		int a5 = 2;
//		int b5 = 2;
//		int c5 = 2;
//		int d5 = 2;
//		System.out.println(dg.solution(a5, b5, c5, d5));
	}

	private int solution(int a, int b, int c, int d) {
		Set<Integer> hs = new HashSet<>();
		int[] numbers = new int[4];
		numbers[0] = a;
		numbers[1] = b;
		numbers[2] = c;
		numbers[3] = d;
		int answer = 0;
		int cnt = 0;
		
		for (int i=0; i<numbers.length; i++) {
			if (hs.add(numbers[i])) {
				
			} else {
				cnt++;
			}
		}
		
		if (cnt == 3) {
			answer = 1111 * a;
		} else if (cnt == 2) {
			
		} else if (cnt == 2) {
			
		}
		
		return answer;
	}

}
