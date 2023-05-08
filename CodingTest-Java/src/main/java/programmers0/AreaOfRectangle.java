package programmers0;

public class AreaOfRectangle {

	//프로그래머스 Level 0. 직사각형의 넓이 구하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120860
	public static void main(String[] args) {
		AreaOfRectangle aor = new AreaOfRectangle();
		
		int[][] dots1 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		System.out.println(aor.solution(dots1));
		
		int[][] dots2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
		System.out.println(aor.solution(dots2));
	}

	private int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        for(int i=1; i<dots.length; i++) {
            if(dots[0][0] == dots[i][0]) {
                if(dots[0][1] > 0 && dots[i][1] < 0) y = Math.abs(dots[0][1]) + Math.abs(dots[i][1]);
                else if(dots[0][1] < 0 && dots[i][1] > 0) y = Math.abs(dots[0][1]) + Math.abs(dots[i][1]);
                else y = Math.abs(dots[0][1] - dots[i][1]);
            }
        }
        for(int i=1; i<dots.length; i++) {
            if(dots[0][1] == dots[i][1]) {
                if(dots[0][0] > 0 && dots[i][0] < 0) x = Math.abs(dots[0][0]) + Math.abs(dots[i][0]);
                else if(dots[0][0] < 0 && dots[i][0] > 0) x = Math.abs(dots[0][0]) + Math.abs(dots[i][0]);
                else x = Math.abs(dots[0][0] - dots[i][0]);
            }
        }
        
        return x * y;
	}

}
