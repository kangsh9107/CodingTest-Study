package programmers1;

import java.util.HashMap;
import java.util.Map;

public class MemoryScore {

	//프로그래머스 Level 1. 추억 점수
	//https://school.programmers.co.kr/learn/courses/30/lessons/176963
	public static void main(String[] args) {
		MemoryScore ms = new MemoryScore();
		
		String[] name1 = {"may", "kein", "kain", "radi"};
		int[] yearning1 = {5, 10, 1, 3};
		String[][] photo1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		System.out.println(ms.solution(name1, yearning1, photo1));
		
//		String[] name2 = {"kali", "mari", "don"};
//		int[] yearning2 = {11, 1, 55};
//		String[][] photo2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
//		System.out.println(ms.solution(name2, yearning2, photo2));
//		
//		String[] name3 = {"may", "kein", "kain", "radi"};
//		int[] yearning3 = {5, 10, 1, 3};
//		String[][] photo3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};
//		System.out.println(ms.solution(name3, yearning3, photo3));
	}
	
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		Map<String, Integer> hm = new HashMap<>();
		for(int i=0; i<name.length; i++) {
			hm.put(name[i], yearning[i]);
		}
		
		int sum = 0;
		for(int i=0; i<photo.length; i++) {
			sum = 0;
			for(int j=0; j<photo[i].length; j++) {
				if(hm.get(photo[i][j]) != null) sum += hm.get(photo[i][j]);
			}
			answer[i] = sum;
		}
		
		return answer;
	}

}
