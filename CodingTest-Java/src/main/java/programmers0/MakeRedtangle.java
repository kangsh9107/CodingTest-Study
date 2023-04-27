package programmers0;

public class MakeRedtangle {

	//프로그래머스 Level 0. 정사각형으로 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/181830
	public static void main(String[] args) {
		MakeRedtangle mr = new MakeRedtangle();
		
		int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
		System.out.println(mr.solution(arr1));
	}

	private int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[max][max];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
	}

}
