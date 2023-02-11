package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FailureRate {

	//프로그래머스 Level 1. 실패율
	//https://school.programmers.co.kr/learn/courses/30/lessons/42889
	public static void main(String[] args) {
		FailureRate fr = new FailureRate();
		
		int N1 = 5;
		int[] stages1 = {2,1,2,6,2,4,3,3};
		System.out.println(fr.solution(N1, stages1));
		
		int N2 = 4;
		int[] stages2 = {4,4,4,4,4};
		System.out.println(fr.solution(N2, stages2));
	}
	
	public List<Integer> solution(int N, int[] stages) {
		//각 스테이지에 존재하는 인원 : stageUsers
		//각 스테이지의 실패율       : stageFilureRate
		Map<Integer, Integer> stageUsers = new HashMap<>();
		Map<Integer, Double> stageFailureRate = new HashMap<>();
		for(int i=1; i<=N+1; i++) {
			stageUsers.put(i, 0);
		}
		for(int s : stages) {
			if(stageUsers.get(s) == 0) stageUsers.put(s, 1);
			else                       stageUsers.put(s, stageUsers.get(s)+1);
		}
		int users = stages.length;
		int cntStageUsers = 0;
		for(int i=1; i<=N+1; i++) {
			if(i == 1) {
				stageFailureRate.put(i, stageUsers.get(i) / (double)users);
			} else {
				stageFailureRate.put(i, stageUsers.get(i) / (double)(users - cntStageUsers));
			}
			cntStageUsers += stageUsers.get(i);
		}
		
		//value로 내림차순 정렬, value가 같으면 key로 오름차순 정렬
        List<Map.Entry<Integer, Double>> sort = new ArrayList<>(stageFailureRate.entrySet());
        Collections.sort(sort, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                if(o1.getValue() > o2.getValue())      return -1;
                else if(o1.getValue() < o2.getValue()) return 1;
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        //정렬한 순서대로 answer에 추가
        List<Integer> answer = new ArrayList<>();
        for(Iterator<Map.Entry<Integer, Double>> iter = sort.iterator(); iter.hasNext();) {
            Map.Entry<Integer, Double> entry = iter.next();
            if(entry.getKey() != N+1) answer.add(entry.getKey());
        }
		
		return answer;
	}

}
