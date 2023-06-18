package main.java.programmers0;

public class SequenceAndIntervalQueries4 {

    /*
     * 프로그래머스 Level 0. 수열과 구간 쿼리 4
     * https://school.programmers.co.kr/learn/courses/30/lessons/181922
     *
     * 생성일 : 2023-06-18
     * 완료일 : 2023-06-18
     */
    public static void main(String[] args) {
        SequenceAndIntervalQueries4 saiq = new SequenceAndIntervalQueries4();

        int[] arr1 = {0, 1, 2, 4, 3};
        int[][] queries1 = {{0, 4, 1}, {0, 3, 2},{0, 3, 3}};
        System.out.println(saiq.solution(arr1, queries1));
    }

    private int[] solution(int[] arr, int[][] queries) {
        for (int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j=s; j<=e; j++) {
                if (j % k == 0) {
                    arr[j]++;
                }
            }
        }

        return arr;
    }

}
