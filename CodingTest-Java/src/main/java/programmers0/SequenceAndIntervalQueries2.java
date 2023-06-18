package main.java.programmers0;

import java.util.ArrayList;
import java.util.List;

public class SequenceAndIntervalQueries2 {

    /*
     * 프로그래머스 Level 0. 수열과 구간 쿼리 2
     * https://school.programmers.co.kr/learn/courses/30/lessons/181923
     *
     * 생성일 : 2023-06-18
     * 완료일 : 2023-06-18
     */
    public static void main(String[] args) {
        SequenceAndIntervalQueries2 saiq = new SequenceAndIntervalQueries2();

        int[] arr1 = {0, 1, 2, 4, 3};
        int[][] queries1 = {{0, 4, 2}, {0, 3, 2},{0, 2, 2}};
        System.out.println(saiq.solution(arr1, queries1));
    }

    private List<Integer> solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();

        for (int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = 1000001;

            for (int j=s; j<=e; j++) {
                if (arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }

            if (min == 1000001) {
                min = -1;
            }

            answer.add(min);
        }

        return answer;
    }

}
