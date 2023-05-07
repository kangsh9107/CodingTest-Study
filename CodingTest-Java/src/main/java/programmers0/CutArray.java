package programmers0;

public class CutArray {

	//프로그래머스 Level 0. 배열 자르기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120833
	public static void main(String[] args) {
		CutArray ca = new CutArray();
		
		int[] numbers1 = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		System.out.println(ca.solution(numbers1, num1, num2));
		
		int[] numbers2 = {1, 3, 5};
		int num3 = 1;
		int num4 = 2;
		System.out.println(ca.solution(numbers2, num3, num4));
	}

	private int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int index = 0;
        for(int i=num1; i<=num2; i++) {
            answer[index] = numbers[i];
            index++;
        }
        return answer;
	}

}
