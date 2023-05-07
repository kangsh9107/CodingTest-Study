package programmers0;

import java.util.HashMap;
import java.util.Map;

public class FindeMode {

	//프로그래머스 Level 0. 최빈값 구하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120812
	public static void main(String[] args) {
		FindeMode fm = new FindeMode();
		
		int[] array1 = {1, 2, 3, 3, 3, 4};
		System.out.println(fm.solution(array1));
		
		int[] array2 = {1, 1, 2, 2};
		System.out.println(fm.solution(array2));
		
		int[] array3 = {1};
		System.out.println(fm.solution(array3));
	}

	private int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int a : array) {
            if(hm.get(a) == null) hm.put(a, 1);
            else                  hm.put(a, hm.get(a)+1);
        }
        
        int max = 0;
        int cnt = 0;
        for(int key : hm.keySet()) {
            if(hm.get(key) > max) {
                max = hm.get(key);
                answer = key;
            }
        }
        for(int key : hm.keySet()) {
            if(hm.get(key) == max) cnt++;
        }
        if(cnt > 1) answer = -1;
        return answer;
	}

}
