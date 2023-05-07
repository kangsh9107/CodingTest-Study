package programmers0;

public class CountDuplicatedNumber {

	//프로그래머스 Level 0. 중복된 숫자 개수
	//https://school.programmers.co.kr/learn/courses/30/lessons/120583
	public static void main(String[] args) {
		CountDuplicatedNumber cdn = new CountDuplicatedNumber();
		
		int[] array1 = {1, 1, 2, 3, 4, 5};
		int n1 = 1;
		System.out.println(cdn.solution(array1, n1));
		
//		int[] array2 = {0, 2, 3, 4};
//		int n2 = 1;
//		System.out.println(cdn.solution(array2, n2));
	}

	private int solution(int[] array, int n) {
        int answer = 0;
        for(int a : array) {
            if(a == n) answer++;
        }
        return answer;
	}

}
