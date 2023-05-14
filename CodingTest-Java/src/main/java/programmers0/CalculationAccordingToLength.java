package programmers0;

public class CalculationAccordingToLength {

	//프로그래머스 Level 0. 길이에 따른 연산
	//https://school.programmers.co.kr/learn/courses/30/lessons/181879
	public static void main(String[] args) {
		CalculationAccordingToLength catl = new CalculationAccordingToLength();
		
		int[] num_list1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
		System.out.println(catl.solution(num_list1));
		
		int[] num_list2 = {2, 3, 4, 5};
		System.out.println(catl.solution(num_list2));
	}

	private int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >= 11) {
        	for(int n : num_list) {
        		answer += n;
        	}
        } else {
        	answer = 1;
        	for(int n : num_list) {
        		answer *= n;
        	}
        }
        return answer;
	}

}
