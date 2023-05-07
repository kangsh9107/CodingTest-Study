package programmers0;

public class PrintAge {

	//프로그래머스 Level 0. 나이 출력
	//https://school.programmers.co.kr/learn/courses/30/lessons/120820
	public static void main(String[] args) {
		PrintAge pa = new PrintAge();
		
		int age1 = 40;
		System.out.println(pa.solution(age1));
		
		int age2 = 23;
		System.out.println(pa.solution(age2));
	}

	private int solution(int age) {
        return 2023-age;
	}

}
