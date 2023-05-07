package programmers0;

public class DoubleTheArray {

	//프로그래머스 Level 0. 배열 두 배 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120809
	public static void main(String[] args) {
		DoubleTheArray dta = new DoubleTheArray();
		
		int[] numbers1 = {1, 2, 3, 4, 5};
		System.out.println(dta.solution(numbers1));
		
//		int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};
//		System.out.println(dta.solution(numbers2));
	}

	private int[] solution(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
	}

}
