package main.java.programmers2;

/*
 * 프로그래머스 Level 2. 행렬의 곱셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/12949
 *
 * 생성일 : 2023-08-02
 * 완료일 : 2023-08-21
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
        int row = arr1.length;       // arr1의 행의 개수
        int col = arr2[0].length;    // arr2의 열의 개수
        int sumLength = arr2.length; // arr1의 열의 개수 = arr2의 행의 개수
        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = 0;

                for (int k = 0; k < sumLength; k++) {
                    sum += arr1[i][k] * arr2[k][j]; // arr1의 i번째 행의 각 원소와 arr2의 j번째 열의 각 원소를 곱해서 더함
                }

                answer[i][j] = sum;
            }
        }

        return answer;
    }
}
