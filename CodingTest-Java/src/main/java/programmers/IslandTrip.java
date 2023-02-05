package programmers;

import java.util.ArrayList;
import java.util.List;

public class IslandTrip {

	//프로그래머스 자바 Level 2 무인도 여행
	//https://school.programmers.co.kr/learn/courses/30/lessons/154540
	public static void main(String[] args) {
		IslandTrip it = new IslandTrip();
		
		String[] maps1 = {"X591X", "X1X5X", "X231X", "1XXX1"};
		System.out.println(it.solution(maps1));
		
//		String[] maps2 = {"XXX", "XXX", "XXX"};
//		System.out.println(it.solution(maps2));
	}
	
	public List<Integer> solution(String[] maps) {
		int countX = 0;
		for(int i=0; i<maps.length; i++) {
			countX += maps[i].length() - maps[i].replaceAll("X", "").length();
		}
		if( countX == (maps.length*maps[0].length()) ) {
			List<Integer> noFood = new ArrayList<>();
			noFood.add(-1);
			return noFood;
		}
		
		List<Integer> answer = new ArrayList<>();
		List<Integer> indexI = new ArrayList<>();
		List<Integer> indexJ = new ArrayList<>();
		String[][] food = new String[maps.length][maps[0].length()];
		int cnt = 0;
		for(int i=0; i<maps.length; i++) {
			for(int j=0; j<maps[0].length(); j++) {
				food[i][j] = maps[i].split("")[j];
				System.out.print(food[i][j]);
				try {
					Integer.parseInt(maps[i].split("")[j]);
					indexI.add(i);
					indexJ.add(j);
				} catch(Exception e) {
					
				}
			}
			System.out.println();
		}
		System.out.println(indexI);
		System.out.println(indexJ);
		
		return answer;
	}

}
