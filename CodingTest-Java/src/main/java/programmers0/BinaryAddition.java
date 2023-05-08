package programmers0;

public class BinaryAddition {

	//프로그래머스 Level 0. 이진수 더하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120885
	public static void main(String[] args) {
		BinaryAddition ba = new BinaryAddition();
		
		String bin1 = "10";
		String bin2 = "11";
		System.out.println(ba.solution(bin1, bin2));
		
		String bin3 = "1001";
		String bin4 = "1111";
		System.out.println(ba.solution(bin3, bin4));
	}

	private String solution(String bin1, String bin2) {
        int answer = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(answer);
	}

}
