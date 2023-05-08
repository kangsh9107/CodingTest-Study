package programmers0;

public class Parallel {

	//프로그래머스 Level 0. 평행
	//https://school.programmers.co.kr/learn/courses/30/lessons/120875
	public static void main(String[] args) {
		Parallel p = new Parallel();
		
		int[][] dots1 = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		System.out.println(p.solution(dots1));
		
		int[][] dots2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
		System.out.println(p.solution(dots2));
	}

	private int solution(int[][] dots) {
        int answer = 0;
        if((dots[1][1]-dots[0][1]) / (dots[1][0]-(double)dots[0][0]) ==
           (dots[3][1]-dots[2][1]) / (dots[3][0]-(double)dots[2][0])) {
            answer++;
        } else if((dots[2][1]-dots[0][1]) / (dots[2][0]-(double)dots[0][0]) ==
                  (dots[3][1]-dots[1][1]) / (dots[3][0]-(double)dots[1][0])) {
            answer++;
        } else if((dots[3][1]-dots[0][1]) / (dots[3][0]-(double)dots[0][0]) ==
                  (dots[2][1]-dots[1][1]) / (dots[2][0]-(double)dots[1][0])) {
            answer++;
        }
        return answer;
	}

}
