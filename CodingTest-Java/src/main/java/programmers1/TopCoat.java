package programmers1;

public class TopCoat {

	//프로그래머스 Level 1. 덧칠하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/161989
	public static void main(String[] args) {
		TopCoat tc = new TopCoat();
		
		int n1 = 8;
		int m1 = 4;
		int[] section1 = {2, 3, 6};
		System.out.println(tc.solution(n1, m1, section1));
		
		int n2 = 5;
		int m2 = 4;
		int[] section2 = {1, 3};
		System.out.println(tc.solution(n2, m2, section2));
		
		int n3 = 4;
		int m3 = 1;
		int[] section3 = {1, 2, 3, 4};
		System.out.println(tc.solution(n3, m3, section3));
	}
	
	public int solution(int n, int m, int[] section) {
		int answer = 0;
		int painted = 0;
		for(int i=0; i<section.length; i++) {
			if(painted >= section[i]) {
				continue;
			} else {
				painted = section[i] + m - 1;
				answer++;
			}
		}
		
		return answer;
	}

}
