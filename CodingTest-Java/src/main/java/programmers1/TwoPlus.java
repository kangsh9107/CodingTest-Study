package programmers1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoPlus {
	
	//프로그래머스 자바 Level 1 두 개 뽑아서 더하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/68644
	public static void main(String[] args) {
		TwoPlus tp = new TwoPlus();
		
		int[] numbers1 = {2,1,3,4,1};
		System.out.println(tp.solution(numbers1));
		
//		int[] numbers2 = {5,0,2,7};
//		System.out.println(tp.solution(numbers2));
	}
	
	static Set<Integer> hs = new HashSet<>();
	public List<Integer> solution(int[] numbers) {
		int n = numbers.length;
		int r = 2;
		boolean[] visited = new boolean[n];
		combination(numbers, visited, 0, n, r);
		List<Integer> answer = new ArrayList<>(hs);
		Collections.sort(answer);
		return answer;
	}
	public static void combination(int[] numbers, boolean[] visited, int start, int n, int r) {
		if(r == 0) {
			sum(numbers, visited, n);
			return;
		}
		for(int i=start; i<n; i++) {
			visited[i] = true;
			combination(numbers, visited, i+1, n, r-1);
			visited[i] = false;
		}
	}
	public static void sum(int[] numbers, boolean[] visited, int n) {
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(visited[i]) cnt += numbers[i];
		}
		hs.add(cnt);
	}

}
