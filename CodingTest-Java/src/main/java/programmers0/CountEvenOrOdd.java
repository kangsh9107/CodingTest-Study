package programmers0;

public class CountEvenOrOdd {

	//프로그래머스 Level 0. 짝수 홀수 개수
	//https://school.programmers.co.kr/learn/courses/30/lessons/120824
	public static void main(String[] args) {
		CountEvenOrOdd ceoo = new CountEvenOrOdd();
		
		int[] num_list1 = {1, 2, 3, 4, 5};
		System.out.println(ceoo.solution(num_list1));
		
		int[] num_list2 = {1, 3, 5, 7};
		System.out.println(ceoo.solution(num_list2));
	}

	private int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int n : num_list) {
            if(n % 2 == 0) even++;
            else odd++;
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
	}

}
