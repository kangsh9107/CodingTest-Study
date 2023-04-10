package programmers1;

public class ScalarProduct {

	//프로그래머스 Level 1. 내적
	//https://school.programmers.co.kr/learn/courses/30/lessons/70128
	public static void main(String[] args) {
		ScalarProduct sp = new ScalarProduct();
		
		int[] a1 = {1,2,3,4};
		int[] b1 = {-3,-1,0,2};
		System.out.println(sp.solution(a1, b1));
		
		int[] a2 = {-1,0,1};
		int[] b2 = {1,0,-1};
		System.out.println(sp.solution(a2, b2));
	}
	
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }
        
        return answer;
    }

}
