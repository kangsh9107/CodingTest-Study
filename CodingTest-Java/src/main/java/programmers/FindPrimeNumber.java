package programmers;

public class FindPrimeNumber {

	//프로그래머스 Level 1. 소수 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12921
	public static void main(String[] args) {
		FindPrimeNumber fpn = new FindPrimeNumber();
		
		int n1 = 10;
		System.out.println(fpn.solution(n1));
		
		int n2 = 5;
		System.out.println(fpn.solution(n2));
	}
	
	public int solution(int n) {
		int answer = 0;
		boolean[] notPrimeNumber = new boolean[n + 1];
		notPrimeNumber[0] = notPrimeNumber[1] = true;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(notPrimeNumber[i]) continue;
			
			for(int j=i*i; j<notPrimeNumber.length; j+=i) {
				notPrimeNumber[j] = true;
			}
		}
		
		for(int k=2; k<notPrimeNumber.length; k++) {
			if( !notPrimeNumber[k] ) answer++;
		}
		return answer;
	}

}
