package programmers1;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

	//프로그래머스 Level 1. 로또의 최고 순위와 최저 순위
	//https://school.programmers.co.kr/learn/courses/30/lessons/77484
	public static void main(String[] args) {
		Lotto lt = new Lotto();
		
		int[] lottos1 = {44, 1, 0, 0, 31, 25};
		int[] win_nums1 = {31, 10, 45, 1, 6, 19};
		System.out.println(lt.solution(lottos1, win_nums1));
		
//		int[] lottos2 = {0, 0, 0, 0, 0, 0};
//		int[] win_nums2 = {38, 19, 20, 40, 15, 25};
//		System.out.println(lt.solution(lottos2, win_nums2));
//		
//		int[] lottos3 = {45, 4, 35, 20, 3, 9};
//		int[] win_nums3 = {20, 9, 3, 45, 4, 35};
//		System.out.println(lt.solution(lottos3, win_nums3));
	}
	
	public List<Integer> solution(int[] lottos, int[] win_nums) {
		List<Integer> answer = new ArrayList<>();
		int same = 0;
		int cntZero = 0;
		for(int i=0; i<6; i++) {
			if(lottos[i] == 0) cntZero++;
			for(int j=0; j<6; j++) {
				if(lottos[i] == win_nums[j]) same++;
			}
		}
		
		int low = 0;
		int high = 0;
		if(same < 2) low = 6;
		else if(same == 2) low = 5;
		else if(same == 3) low = 4;
		else if(same == 4) low = 3;
		else if(same == 5) low = 2;
		else if(same == 6) low = 1;
		
		same += cntZero;
		if(same < 2) high = 6;
		else if(same == 2) high = 5;
		else if(same == 3) high = 4;
		else if(same == 4) high = 3;
		else if(same == 5) high = 2;
		else if(same == 6) high = 1;
		answer.add(high);
		answer.add(low);
		
		return answer;
	}

}
