package programmers2;

public class Carpet {

	//프로그래머스 Level 2. 카펫
	//https://school.programmers.co.kr/learn/courses/30/lessons/42842
	public static void main(String[] args) {
		Carpet cp = new Carpet();
		
		int brown1 = 10;
		int yellow1 = 2;
		System.out.println(cp.solution(brown1, yellow1));
		
//		int brown2 = 8;
//		int yellow2 = 1;
//		System.out.println(cp.solution(brown2, yellow2));
//		
//		int brown3 = 24;
//		int yellow3 = 24;
//		System.out.println(cp.solution(brown3, yellow3));
	}
	
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int cnt = 0;
        for(int i=1; i<=brown; i++) {
            for(int j=1; j<=brown; j++) {
                if( ((2 * (i + j)) - 4 == brown) && ((i - 2) * (j - 2) == yellow) ) {
                	answer[0] = Math.max(i, j);
                	answer[1] = Math.min(i, j);
                	cnt++;
                	break;
                }
            }
            if(cnt > 0) break;
        }
        
        return answer;
	}

}
