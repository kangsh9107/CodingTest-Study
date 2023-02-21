package programmers0;

public class PlusFraction {

	//프로그래머스 Level 0. 분수의 덧셈
	//https://school.programmers.co.kr/learn/courses/30/lessons/120808
	public static void main(String[] args) {
		PlusFraction pf = new PlusFraction();
		
		int numer1 = 1;
		int denom1 = 2;
		int numer2 = 1;
		int denom2 = 2;
		System.out.println(pf.solution(numer1, denom1, numer2, denom2));
		
//		int numer3 = 9;
//		int denom3 = 2;
//		int numer4 = 1;
//		int denom4 = 3;
//		System.out.println(pf.solution(numer1, denom1, numer2, denom2));
	}
	
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int tempN = (numer1 * denom2) + (numer2 * denom1);
        int tempD = denom1 * denom2;
        for(int i=2; i<=Math.max(tempN, tempD); i++) {
        	if(tempN % i == 0 && tempD % i == 0) {
        		tempN /= i;
        		tempD /= i;
        		i = 1;
        	}
        }
        answer[0] = tempN;
        answer[1] = tempD;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        
        return answer;
    }

}
