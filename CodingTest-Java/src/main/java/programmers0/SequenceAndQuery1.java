package programmers0;

public class SequenceAndQuery1 {

	//프로그래머스 Level 0. 수열과 구간 쿼리 1
	//https://school.programmers.co.kr/learn/courses/30/lessons/181883
	public static void main(String[] args) {
		SequenceAndQuery1 saq = new SequenceAndQuery1();
		
		int[] arr1 = {0, 1, 2, 3, 4};
		int[][] queries1 = {{0, 1}, {1, 2}, {2, 3}};
		System.out.println(saq.solution(arr1, queries1));
	}

	private int[] solution(int[] arr, int[][] queries) {
		for (int i=0; i<queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1] + 1;
			
			for (int j=start; j<end; j++) {
				arr[j]++;
			}
		}
		
		return arr;
	}

}
