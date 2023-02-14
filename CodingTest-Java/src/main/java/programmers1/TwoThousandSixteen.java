package programmers1;

public class TwoThousandSixteen {

	//프로그래머스 Level 1. 2016년
	//https://school.programmers.co.kr/learn/courses/30/lessons/12901
	public static void main(String[] args) {
		TwoThousandSixteen tts = new TwoThousandSixteen();
		
		int a = 5;
		int b = 24;
		System.out.println(tts.solution(a, b));
	}
	
	public String solution(int a, int b) {
		String[] week = {"THU", "FRI","SAT", "SUN","MON","TUE","WED"};
		int[] day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i=1; i<a; i++) {
			b += day[i];
		}
		b %= 7;
		String answer = week[b];
		return answer;
	}

}
