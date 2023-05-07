package programmers0;

public class FindeCompositeNumber {

	//프로그래머스 Level 0. 합성수 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120846
	public static void main(String[] args) {
		FindeCompositeNumber fcn = new FindeCompositeNumber();
		
		int n1 = 10;
		System.out.println(fcn.solution(n1));
		
		int n2 = 15;
		System.out.println(fcn.solution(n2));
	}

	private int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for(int i=4; i<=n; i++) {
            cnt = 0;
            for(int j=1; j<=i; j++) {
                if(i % j == 0) cnt++;
            }
            if(cnt >= 3) answer++;
        }
        return answer;
	}

}
