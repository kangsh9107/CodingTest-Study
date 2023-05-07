package programmers0;

public class MakeTwoDimension {

	//프로그래머스 Level 0. 2차원으로 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120842
	public static void main(String[] args) {
		MakeTwoDimension mtd = new MakeTwoDimension();
		
		int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
		int n1 = 2;
		System.out.println(mtd.solution(num_list1, n1));
		
		int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		int n2 = 3;
		System.out.println(mtd.solution(num_list2, n2));
	}

	private int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int index = 0;
        for(int i=0; i<num_list.length/n; i++) {
            for(int j=0; j<n; j++) {
                answer[i][j] = num_list[index];
                index++;
            }
        }
        return answer;
	}

}
