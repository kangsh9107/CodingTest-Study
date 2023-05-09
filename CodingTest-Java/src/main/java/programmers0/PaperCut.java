package programmers0;

public class PaperCut {

	//프로그래머스 Level 0. 종이 자르기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120922
	public static void main(String[] args) {
		PaperCut pc = new PaperCut();
		
		int M1 = 2;
		int N1 = 2;
		System.out.println(pc.solution(M1, N1));
		
		int M2 = 2;
		int N2 = 5;
		System.out.println(pc.solution(M2, N2));
		
		int M3 = 1;
		int N3 = 1;
		System.out.println(pc.solution(M3, N3));
	}

	private int solution(int M, int N) {
        int answer = 0;
        answer += (M - 1);
        answer += ((N - 1) * M);
        return answer;
	}

}
