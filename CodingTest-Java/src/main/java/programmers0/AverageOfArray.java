package programmers0;

public class AverageOfArray {

	//프로그래머스 Level 0. 배열의 평균값
	//https://school.programmers.co.kr/learn/courses/30/lessons/120817
	public static void main(String[] args) {
		AverageOfArray aoa = new AverageOfArray();
		
		int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(aoa.solution(numbers1));
		
		int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println(aoa.solution(numbers2));
	}

	private double solution(int[] numbers) {
        double answer = 0;
        for(int i=0; i<numbers.length; i++) {
            answer += numbers[i];
        }
        return answer / numbers.length;
	}

}
