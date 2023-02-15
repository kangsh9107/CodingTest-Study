package programmers0;

import java.util.Arrays;

public class CloseNumber {

	//프로그래머스 Level 0. 가까운 수
	//https://school.programmers.co.kr/learn/courses/30/lessons/120890
	public static void main(String[] args) {
		CloseNumber cn = new CloseNumber();
		
		int[] array1 = {3, 10, 28};
		int n1 = 20;
		System.out.println(cn.solution(array1, n1));
		
//		int[] array2 = {10, 11, 12};
//		int n2 = 13;
//		System.out.println(cn.solution(array2, n2));
	}
	
    public int solution(int[] array, int n) {
        int answer = 0;
        int close = 100;
        Arrays.sort(array);
        for(int a : array) {
            if(Math.abs(n-a) < close) {
            	close = Math.abs(n-a);
            	answer = a;
            }
        }
        return answer;
    }

}
