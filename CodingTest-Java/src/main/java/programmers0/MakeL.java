package programmers0;

public class MakeL {

	//프로그래머스 Level 0. l로 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181834
	public static void main(String[] args) {
		MakeL ml = new MakeL();
		
		String myString1 = "";
		System.out.println(ml.solution(myString1));
		
//		String myString2 = "";
//		System.out.println(ml.solution(myString2));
	}

	private String solution(String myString) {
		return myString.replaceAll("[a-k]", "l");
	}
	

}
