package programmers0;

public class SpecialTwoDimension {

	//프로그래머스 Level 0. 특별한 이차원 배열 2
	//https://school.programmers.co.kr/learn/courses/30/lessons/181831
	public static void main(String[] args) {
		SpecialTwoDimension std = new SpecialTwoDimension();
		
		int[][] arr1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
		System.out.println(std.solution(arr1));
	}
	
	public int solution(int[][] arr) {
		int answer = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] != arr[j][i]) return 0;
			}
		}
		
		return answer;
	}

}
