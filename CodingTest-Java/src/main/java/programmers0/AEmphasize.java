package programmers0;

public class AEmphasize {

	//프로그래머스 Level 0. A 강조하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181874
	public static void main(String[] args) {
		AEmphasize ae = new AEmphasize();
		
		String myString1 = "abstract algebra";
		System.out.println(ae.solution(myString1));
		
		String myString2 = "PrOgRaMmErS";
		System.out.println(ae.solution(myString2));
	}

	private String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
	}

}
