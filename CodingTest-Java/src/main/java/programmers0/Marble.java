package programmers0;

public class Marble {

	//프로그래머스 Level 0. 구슬을 나누는 경우의 수
	//https://school.programmers.co.kr/learn/courses/30/lessons/120840
	public static void main(String[] args) {
		Marble m = new Marble();
		
		int balls1 = 3;
		int share1 = 2;
		System.out.println(m.solution(balls1, share1));
		
		int balls2 = 5;
		int share2 = 3;
		System.out.println(m.solution(balls2, share2));
	}

    static int answer = 0;
    public static int solution(int balls, int share) {
        int[] array = new int[balls];
        boolean[] visited = new boolean[balls];
        combination(array, visited, 0, balls, share);
        return answer;
    }
    
    public static void combination(int[] array, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            answer++;
            return;
        }
        
        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(array, visited, i+1, n, r-1);
            visited[i] = false;
        }
    }

}
