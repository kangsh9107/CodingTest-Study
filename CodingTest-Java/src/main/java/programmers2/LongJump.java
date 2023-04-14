package programmers2;

public class LongJump {

	//프로그래머스 Level 1. 멀리 뛰기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12914
	public static void main(String[] args) {
		LongJump lj = new LongJump();
		
		int n1 = 4;
		System.out.println(lj.solution(n1));
		
//		int n2 = 3;
//		System.out.println(lj.solution(n2));
	}
	
	public long solution(int n) {
		long answer = 1; //1칸만 뛰는 경우
		
		int one = n;     //1칸 뛰는 최대 횟수
		int two = n / 2; //2칸 뛰는 최대 횟수
		int tot = 0;     //전체 뛰는 횟수
		int sum = 1;     //조합 계산용
		for(int i=1; i<=two; i++) {
			sum = 1;
			one = n - (2 * i);
			tot = one + i;
			
			//전체 뛰는 횟수에서 2칸을 언제 뛸지 배치하는 경우의 수를 answer에 더한다.
			//예를 들어 1칸 2칸 2칸, 2칸 1칸 2칸, 2칸 2칸 1칸 처럼 배치하는 경우의 수다.
			//즉, 전체 뛰는 횟수에서 2칸 뛰는 횟수를 조합으로 뽑는다.
			//이때 2칸 뛰는 횟수를 변할 수 있으므로 for문을 사용한다.
			for(int j=tot; j>tot-i; j--) {
				sum *= j;
			}
			for(int k=2; k<=i; k++) {
				sum /= k;
			}
			answer += sum;
		}
		
		return answer;
	}

}
