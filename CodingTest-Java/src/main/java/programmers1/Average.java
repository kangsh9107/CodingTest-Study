package programmers1;

public class Average {

	//프로그래머스 Level 1. 평균 구하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12944
	public static void main(String[] args) {
		Average ag = new Average();
		
		int[] arr1 = {1,2,3,4};
		System.out.println(ag.solution(arr1));
		
		int[] arr2 = {5,5};
		System.out.println(ag.solution(arr2));
	}
	
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int a : arr) {
            answer += a;
        }
        
        answer /= arr.length;
        
        return answer;
    }

}
