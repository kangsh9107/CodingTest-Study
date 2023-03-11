package programmers1;

public class CardDeck {

	//프로그래머스 Level 1. 카드 뭉치
	//https://school.programmers.co.kr/learn/courses/30/lessons/159994
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		
//		String[] cards1 = {"i", "drink", "water"};
//		String[] cards2 = {"want", "to"};
//		String[] goal1 = {"i", "want", "to", "drink", "water"};
//		System.out.println(cd.solution(cards1, cards2, goal1));
//		
//		String[] cards3 = {"i", "water", "drink"};
//		String[] cards4 = {"want", "to"};
//		String[] goal2 = {"i", "want", "to", "drink", "water"};
//		System.out.println(cd.solution(cards3, cards4, goal2));
		
		String[] cards5 = {"a", "b", "c"};
		String[] cards6 = {"d", "e"};
		String[] goal3 = {"b", "c", "d", "e"};
		System.out.println(cd.solution(cards5, cards6, goal3));
	}
	
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		
		int index = -1;
		int cnt = 0;
		for(int i=0; i<cards1.length; i++) {
			for(int j=0; j<goal.length; j++) {
				if(cards1[i].equals(goal[j]) && index <= j) {
					index = j;
				} else if(cards1[i].equals(goal[j]) && index > j) {
					answer = "No";
				}
			}
		}
		
		index = -1;
		for(int i=0; i<cards2.length; i++) {
			for(int j=0; j<goal.length; j++) {
				if(cards2[i].equals(goal[j]) && index <= j) {
					index = j;
				} else if(cards2[i].equals(goal[j]) && index > j) {
					answer = "No";
				}
			}
		}
		
		return answer;
	}

}
