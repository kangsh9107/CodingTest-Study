package programmers0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StrangeArray {

	//프로그래머스 Level 0. 특이한 정렬
	//https://school.programmers.co.kr/learn/courses/30/lessons/120880
	public static void main(String[] args) {
		StrangeArray sa = new StrangeArray();
		
//		int[] numlist1 = {1, 2, 3, 4, 5, 6};
//		int n1 = 4;
//		System.out.println(sa.solution(numlist1, n1));
		
		int[] numlist2 = {10000,20,36,47,40,6,10,7000};
		int n2 = 30;
		System.out.println(sa.solution(numlist2, n2));
	}
	
	public List<Integer> solution(int[] numlist, int n) {
		List<Integer> answer = new ArrayList<>();
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<numlist.length; i++) {
			hm.put(numlist[i], Math.abs(numlist[i] - n));
		}
		
		List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if(o1.getValue() > o2.getValue()) return 1;
				else if(o1.getValue() < o2.getValue()) return -1;
				return o1.getKey() > o2.getKey() ? -1 : 1;
			}
		});
		
		Map<Integer, Integer> sorted = new LinkedHashMap<>();
		for(Iterator<Map.Entry<Integer, Integer>> iter = list.iterator(); iter.hasNext();) {
			Map.Entry<Integer, Integer> entry = iter.next();
			answer.add(entry.getKey());
		}
		
		return answer;
	}

}
