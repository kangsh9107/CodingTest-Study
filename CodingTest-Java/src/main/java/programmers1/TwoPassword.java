package programmers1;

public class TwoPassword {

	//프로그래머스 Level 1. 둘만의 암호
	//https://school.programmers.co.kr/learn/courses/30/lessons/155652
	public static void main(String[] args) {
		TwoPassword tp = new TwoPassword();
		
		String s1 = "aukks";
		String skip1 = "wdqd";
		int index1 = 5;
		System.out.println(tp.solution(s1, skip1, index1));
	}
	
	public String solution(String s, String skip, int index) {
		String answer = "";
		String x = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alphabet.charAt(0) - '0');
		
		for(int i=0; i<s.length(); i++) {
			x = s.substring(i, i+1);
		}
		
		return answer;
	}

}
