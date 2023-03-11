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
		int cnt = 0;
		int index1 = -1;
		int index2 = -1;
		boolean[] check1 = new boolean[cards1.length];
		boolean[] check2 = new boolean[cards2.length];
		for(int i=0; i<goal.length; i++) {
			for(int j=0; j<cards1.length; j++) {
				if(goal[i].equals(cards1[j]) && index1 <= j) {
					index1 = j;
					check1[j] = true;
				} else if(goal[i].equals(cards1[j])) {
					answer = "No";
					cnt++;
					break;
				}
			}
			for(int k=0; k<cards2.length; k++) {
				if(goal[i].equals(cards2[k]) && index2 <= k) {
					index2 = k;
					check2[k] = true;
				} else if(goal[i].equals(cards2[k])) {
					answer = "No";
					cnt++;
					break;
				}
			}
			if(cnt > 0) break;
		}
		
		for(int i=1; i<check1.length; i++) {
			if( !check1[i - 1] && check1[i] ) {
				answer = "No";
				break;
			}
		}
		for(int i=1; i<check2.length; i++) {
			if( !check2[i - 1] && check2[i] ) {
				answer = "No";
				break;
			}
		}
		
		return answer;
	}

}
