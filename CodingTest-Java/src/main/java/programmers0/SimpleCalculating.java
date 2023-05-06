package programmers0;

public class SimpleCalculating {

	//프로그래머스 Level 0. 간단한 식 계산하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181865
	public static void main(String[] args) {
		SimpleCalculating sc = new SimpleCalculating();
		
		String binomial1 = "43 + 12";
		System.out.println(sc.solution(binomial1));
		
//		String binomial2 = "0 - 7777";
//		System.out.println(sc.solution(binomial2));
//		
//		String binomial3 = "40000 * 40000";
//		System.out.println(sc.solution(binomial3));
	}

	private int solution(String binomial) {
		int answer = 0;
		String[] temp = binomial.split(" ");
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[2]);
		if(temp[1].equals("+")) answer = a + b;
		else if(temp[1].equals("-")) answer = a - b;
		else if(temp[1].equals("*")) answer = a * b;
		else answer = a / b;
		
		return answer;
	}

}
