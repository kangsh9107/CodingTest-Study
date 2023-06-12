package programmers0;

public class RemainderAfterDividingByNine {

	//프로그래머스 Level 0. 9로 나눈 나머지
	//https://school.programmers.co.kr/learn/courses/30/lessons/181914
	public static void main(String[] args) {
		RemainderAfterDividingByNine radbn = new RemainderAfterDividingByNine();
		
		String number1 = "123";
		System.out.println(radbn.solution(number1));
		
//		String number2 = "78720646226947352489";
//		System.out.println(radbn.solution(number2));
	}

	private int solution(String number) {
		int answer = 0;
		String[] split = number.split("");
		for (int i=0; i<split.length; i++) {
			answer += Integer.parseInt(split[i]);
		}
		
		return answer % 9;
	}

}
