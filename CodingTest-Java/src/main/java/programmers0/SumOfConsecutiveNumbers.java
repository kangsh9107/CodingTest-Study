package programmers0;

public class SumOfConsecutiveNumbers {

	//프로그래머스 Level 0. 연속된 수의 합
	//https://school.programmers.co.kr/learn/courses/30/lessons/120923
	public static void main(String[] args) {
		SumOfConsecutiveNumbers socn = new SumOfConsecutiveNumbers();
		
		int num1 = 3;
		int total1 = 12;
		System.out.println(socn.solution(num1, total1));
		
		int num2 = 3;
		int total2 = 12;
		System.out.println(socn.solution(num2, total2));
		
		int num3 = 3;
		int total3 = 12;
		System.out.println(socn.solution(num3, total3));
		
		int num4 = 3;
		int total4 = 12;
		System.out.println(socn.solution(num4, total4));
	}

	private int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 0;
        for(int i=-1000; i<=1000; i++) {
            sum = 0;
            for(int j=0; j<num; j++) {
                sum += (i + j);
            }
            if(sum == total) {
                for(int k=0; k<num; k++) {
                    answer[k] = i + k;
                }
            }
        }
        return answer;
	}

}
