package programmers1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SortStrings {

	//프로그래머스 자바 Level 1 문자열 내 마음대로 정렬하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12915
	public static void main(String[] args) {
		SortStrings ss = new SortStrings();
		
		String[] strings1 = {"sun", "bed", "car"};
		int n1 = 1;
		System.out.println(ss.solution(strings1, n1));
		
//		String[] strings2 = {"abce", "abcd", "cdx"};
//		int n2 = 2;
//		System.out.println(ss.solution(strings2, n2));
	}
	
	public List<String> solution(String[] strings, int n) {
		List<String> answer = new ArrayList<>();
		
		//주어진 문자열을 <문자열, n번째 인덱스 문자 아스키 코드>로 저장
		Map<String, Integer> hm = new HashMap<>();
		for(String s: strings) {
			hm.put(s, s.charAt(n)-'0');
		}
		//value로 오름차순 정렬, value가 같으면 key로 오름차순 정렬
        List<Map.Entry<String, Integer>> sort = new ArrayList<>(hm.entrySet());
        Collections.sort(sort, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            	System.out.println("o1 : " + o1.getKey());
            	System.out.println("o2 : " + o2.getKey());
                if(o1.getValue() > o2.getValue())      return 1;
                else if(o1.getValue() < o2.getValue()) return -1;
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        //정렬한 순서대로 answer에 추가
        for(Iterator<Map.Entry<String, Integer>> iter = sort.iterator(); iter.hasNext();) {
            Map.Entry<String, Integer> entry = iter.next();
            answer.add(entry.getKey());
        }
		
		return answer;
	}

}
