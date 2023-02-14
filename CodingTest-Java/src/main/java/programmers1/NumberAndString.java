package programmers1;

public class NumberAndString {

	//프로그래머스 자바 level 1 숫자 문자열과 영단어
	//https://school.programmers.co.kr/learn/courses/30/lessons/81301
	public static void main(String[] args) {
		NumberAndString nas = new NumberAndString();
		
		String s1 = "one4seveneight";
		System.out.println(nas.solution(s1));
		
//		String s2 = "123";
//		System.out.println(nas.solution(s2));
	}
	
	public int solution(String s) {
		int answer = 0;
		
		try {
			answer = Integer.parseInt(s);
		} catch(Exception e) {
			s = s.replaceAll("zero", "0");
			s = s.replaceAll("one", "1");
			s = s.replaceAll("two", "2");
			s = s.replaceAll("three", "3");
			s = s.replaceAll("four", "4");
			s = s.replaceAll("five", "5");
			s = s.replaceAll("six", "6");
			s = s.replaceAll("seven", "7");
			s = s.replaceAll("eight", "8");
			s = s.replaceAll("nine", "9");
			answer = Integer.parseInt(s);
		}
		
		return answer;
	}

}
