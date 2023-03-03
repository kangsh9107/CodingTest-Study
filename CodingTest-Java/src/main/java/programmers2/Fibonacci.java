package programmers2;

public class Fibonacci {

	//프로그래머스 Level 2. 피보나치 수
	//https://school.programmers.co.kr/learn/courses/30/lessons/12945
	public static void main(String[] args) {
		Fibonacci fc = new Fibonacci();
		
		int n1 = 3;
		System.out.println(fc.solution(n1));
		
//		int n2 = 5;
//		System.out.println(fc.solution(n2));
	}

    public int solution(int n) {
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++) {
        	if(i == 0) {
        		nums[i] = 1;
        	} else if(i == 1) {
        		nums[i] = 1;
        	} else {
        		nums[i] = (nums[i - 2] % 1234567) + (nums[i - 1] % 1234567);
        	}
        }
        
        return nums[n - 1];
    }
    
}
