package programmers0;

public class LengthOfArrayElement {

	//프로그래머스 Level 0. 배열 원소의 길이
	//https://school.programmers.co.kr/learn/courses/30/lessons/120854
	public static void main(String[] args) {
		LengthOfArrayElement loae = new LengthOfArrayElement();
		
		String[] strlist1 = {"We", "are", "the", "world!"};
		System.out.println(loae.solution(strlist1));
		
		String[] strlist2 = {"I", "Love", "Programmers."};
		System.out.println(loae.solution(strlist2));
	}

	private int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0; i<strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
	}

}
