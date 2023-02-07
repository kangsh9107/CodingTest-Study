package programmers;

public class FoodFightCompetition {

	//프로그래머스 Level 1. 푸드 파이트 대회
	//https://school.programmers.co.kr/learn/courses/30/lessons/134240
	public static void main(String[] args) {
		FoodFightCompetition ffc = new FoodFightCompetition();
		
		int[] food1 = {1,3,4,6};
		System.out.println(ffc.solution(food1));
		
//		int[] food2 = {1,7,1,2};
//		System.out.println(ffc.solution(food2));
	}
	
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<food.length; i++) {
			for(int j=0; j<(int)food[i]/2; j++) {
				sb.append(i);
			}
		}
		String answer = sb.toString() + "0" + sb.reverse();
		return answer;
	}

}
