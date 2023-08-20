package main.java.programmers2;

/*
 * 프로그래머스 Level 2. 행렬의 곱셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/12949
 *
 * 생성일 : 2023-08-02
 * 완료일 :
 */
public class MatrixMultiplication {

    public static void main(String[] args) {
        MatrixMultiplication sol = new MatrixMultiplication();

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        System.out.println(sol.solution(arr1, arr2));

//        int[][] arr3 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
//        int[][] arr4 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
//        System.out.println(sol.solution(arr3, arr4));
    }

    private int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {

        }

        return answer;
    }
}
