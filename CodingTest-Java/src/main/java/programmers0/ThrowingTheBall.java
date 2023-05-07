package programmers0;

public class ThrowingTheBall {

	//프로그래머스 Level 0. 공 던지기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120843
	public static void main(String[] args) {
		ThrowingTheBall ttb = new ThrowingTheBall();
		
		int[] numbers1 = {1, 2, 3, 4};
		int k1 = 2;
		System.out.println(ttb.solution(numbers1, k1));
		
		int[] numbers2 = {1, 2, 3, 4, 5, 6};
		int k2 = 5;
		System.out.println(ttb.solution(numbers2, k2));
		
		int[] numbers3 = {1, 2, 3};
		int k3 = 3;
		System.out.println(ttb.solution(numbers3, k3));
	}

	private int solution(int[] numbers, int k) {
        int index = 0;
        for(int i=0; i<k-1; i++) {
            index += 2;
        }
        return numbers[index % numbers.length];
	}

}
