package programmers0;

public class AdditionOfFractions {

	//프로그래머스 Level 0. 분수의 덧셈
	//https://school.programmers.co.kr/learn/courses/30/lessons/120808
	public static void main(String[] args) {
		AdditionOfFractions aof = new AdditionOfFractions();
		
		int numer1 = 1;
		int denom1 = 2;
		int numer2 = 3;
		int denom2 = 4;
		System.out.println(aof.solution(numer1, denom1, numer2, denom2));
		
//		int numer3 = 1;
//		int denom3 = 2;
//		int numer4 = 3;
//		int denom4 = 4;
//		System.out.println(aof.solution(numer3, denom3, numer4, denom4));
	}

	private int[] solution(int numer1, int denom1, int numer2, int denom2) {
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
        
        return answer;
	}

}
