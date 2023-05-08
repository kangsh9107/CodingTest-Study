package programmers0;

public class Letter {

	//프로그래머스 Level 0. 편지
	//https://school.programmers.co.kr/learn/courses/30/lessons/120898
	public static void main(String[] args) {
		Letter l = new Letter();
		
		String message1 = "happy birthday!";
		System.out.println(l.solution(message1));
		
		String message2 = "I love you~";
		System.out.println(l.solution(message2));
	}

	private int solution(String message) {
        return message.length() * 2;
	}

}
