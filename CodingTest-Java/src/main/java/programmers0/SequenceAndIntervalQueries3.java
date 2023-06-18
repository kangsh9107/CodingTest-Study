package main.java.programmers0;

public class SequenceAndIntervalQueries3 {

    /*
     * 프로그래머스 Level 0. 수열과 구간 쿼리 3
     * https://school.programmers.co.kr/learn/courses/30/lessons/181924
     *
     * 생성일 : 2023-06-18
     * 완료일 : 2023-06-18
     */
    public static void main(String[] args) {
        SequenceAndIntervalQueries3 sol = new SequenceAndIntervalQueries3();

        int[] arr1 = {0, 1, 2, 3, 4};
        int[][] queries1 = {{0, 3}, {1, 2},{1, 4}};
        System.out.println(sol.solution(arr1, queries1));
    }

    private int[] solution(int[] arr, int[][] queries) {
        for (int i=0; i<queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int temp = 0;

            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        return arr;
    }

}
