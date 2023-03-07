package programmers2;

import java.util.HashSet;
import java.util.Set;

public class EnglishFollowUp {

	//프로그래머스 Level 2. 영어 끝말잇기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12981
	public static void main(String[] args) {
		EnglishFollowUp efu = new EnglishFollowUp();
		
		int n1 = 3;
		String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(efu.solution(n1, words1));
		
//		int n2 = 5;
//		String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage",
//						   "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//		System.out.println(efu.solution(n2, words2));
//		
//		int n3 = 2;
//		String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
//		System.out.println(efu.solution(n3, words3));
	}
	
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		int cnt = 0;
		Set<String> checkDuplicated = new HashSet<>();
		for(int i=0; i<words.length; i++) {
			if(checkDuplicated.add(words[i])) {
				cnt++;
			} else {
				answer[0] = (i % n) + 1;
				answer[1] = cnt;
				break;
			}
		}
		
		return answer;
	}

}
