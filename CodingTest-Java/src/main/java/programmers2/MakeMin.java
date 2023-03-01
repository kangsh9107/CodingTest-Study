package programmers2;

import java.util.Arrays;

public class MakeMin {

	//프로그래머스 Level 2. 최솟값 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12941
	public static void main(String[] args) {
		MakeMin mm = new MakeMin();
		
		int[] A1 = {1, 4, 2};
		int[] B1 = {5, 4, 4};
		System.out.println(mm.solution(A1, B1));
		
		int[] A2 = {1, 2};
		int[] B2 = {3, 4};
		System.out.println(mm.solution(A2, B2));
	}
	
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<A.length; i++) {
            answer += (A[i] * B[B.length-1-i]);
        }

        return answer;
    }

}
