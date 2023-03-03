package programmers2;

public class NumberExpression {

	//프로그래머스 Level 2. 숫자의 표현
	//https://school.programmers.co.kr/learn/courses/30/lessons/12924
	public static void main(String[] args) {
		NumberExpression ne = new NumberExpression();
		
		int n1 = 15;
		System.out.println(ne.solution(n1));
	}

    public int solution(int n) {
    	int answer = 0;
    	int[] nums = new int[(n/2) + 1];
    	for(int i=0; i<nums.length; i++) {
    		nums[i] = i + 1;
    	}
    	
        return answer;
    }
    
}
