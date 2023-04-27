package programmers0;

public class DuplicateLine {

	//프로그래머스  Level 0. 겹치는 선분의 길이
	//https://school.programmers.co.kr/learn/courses/30/lessons/120876
	public static void main(String[] args) {
		DuplicateLine dl = new DuplicateLine();
		
		int[][] lines1 = {{0, 1}, {2, 5}, {3, 9}};
		System.out.println(dl.solution(lines1));
	}

	private int solution(int[][] lines) {
        int answer = 0;
        int[] newLines = new int[200];
        for(int i=0; i<lines.length; i++) {
            for(int j=lines[i][0] + 100; j<lines[i][1] + 100; j++) {
                newLines[j]++;
            }
        }
        for(int i=0; i<newLines.length; i++) {
            if(newLines[i] > 1) answer++;
        }
        
        return answer;
	}

}
