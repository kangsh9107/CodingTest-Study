package programmers1;

public class SumDivisor {

	//프로그래머스 Level 1. 약수의 개수와 덧셈
	//https://school.programmers.co.kr/learn/courses/30/lessons/77884
	public static void main(String[] args) {
		SumDivisor sd = new SumDivisor();
		
		int left1 = 13;
		int right1 = 17;
		System.out.println(sd.solution(left1, right1));
		
		int left2 = 24;
		int right2 = 27;
		System.out.println(sd.solution(left2, right2));
	}
	
    public int solution(int left, int right) {
        int answer = 0;
        
        int cnt = 0;
        for(int i=left; i<=right; i++) {
            cnt = 0;
            for(int j=1; j*j<=i; j++) {
                if(j*j == i) cnt++;
                else if(i % j == 0) cnt += 2;
            }
            
            if(cnt % 2 == 0) answer += i;
            else             answer -= i;
        }
        
        return answer;
    }

}
