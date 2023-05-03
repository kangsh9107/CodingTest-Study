package programmers0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NationalCompetition {

	//프로그래머스 Level 0. 전국 대회 선발 고사
	//https://school.programmers.co.kr/learn/courses/30/lessons/181851
	public static void main(String[] args) {
		NationalCompetition nc = new NationalCompetition();
		
		int[] rank1 = {3, 7, 2, 5, 4, 6, 1};
		boolean[] attendance1 = {false, true, true, true, true, false, false};
		System.out.println(nc.solution(rank1, attendance1));
		
//		int[] rank2 = {1, 2, 3};
//		boolean[] attendance2 = {true, true, true};
//		System.out.println(nc.solution(rank2, attendance2));
//		
//		int[] rank3 = {6, 1, 5, 2, 3, 4};
//		boolean[] attendance3 = {true, false, true, false, false, true};
//		System.out.println(nc.solution(rank3, attendance3));
	}

	private int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<attendance.length; i++) {
            if(attendance[i]) list.add(rank[i]);
        }
        Collections.sort(list);
        
        int[] temp = new int[3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<rank.length; j++) {
                if(list.get(i) == rank[j]) temp[i] = j;
            }
        }
        answer = temp[0] * 10000 + temp[1] * 100 + temp[2];
        
        return answer;
	}

}
