package programmers1;

public class SumMissingNumber {

	//프로그래머스 Level 1. 없는 숫자 더하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/86051
	public static void main(String[] args) {
		SumMissingNumber smn = new SumMissingNumber();
		
		int[] numbers1 = {1,2,3,4,6,7,8,0};
		System.out.println(smn.solution(numbers1));
		
		int[] numbers2 = {5,8,4,0,6,7,9};
		System.out.println(smn.solution(numbers2));
	}
	
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int n : numbers) {
            answer -= n;
        }
        
        return answer;
    }

}
