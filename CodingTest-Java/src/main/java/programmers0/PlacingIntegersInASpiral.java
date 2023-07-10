package main.java.programmers0;

public class PlacingIntegersInASpiral {

    /*
     * 프로그래머스 Level 0. 정수를 나선형으로 배치하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181832
     *
     * 생성일 : 2023-07-07
     * 완료일 :
     */
    public static void main(String[] args) {
        PlacingIntegersInASpiral sol = new PlacingIntegersInASpiral();

        int n1 = 4;
        System.out.println(sol.solution(n1));

//        int n2 = 5;
//        System.out.println(sol.solution(n2));
    }

    private int[][] solution(int n) {
        int[][] snailArray  = new int[n][n];
        int num = 1;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;

        /*
         * arr[0][0] arr[0][1] arr[0][2]
         * arr[1][0] arr[1][1] arr[1][2]
         * arr[2][0] arr[2][1] arr[2][2]
         */
        while (num <= n * n) {
            // Move to right
            for (int i = startCol; i <= endCol; i++) {
                snailArray[startRow][i] = num++;
            }
            startRow++;

            // Move to down
            for (int i = startRow; i <= endRow; i++) {
                snailArray[i][endCol] = num++;
            }
            endCol--;

            // Move to left
            for (int i = endCol; i >= startCol; i--) {
                snailArray[endRow][i] = num++;
            }
            endRow--;

            // Move to up
            for (int i = endRow; i >= startRow; i--) {
                snailArray[i][startCol] = num++;
            }
            startCol++;
        }

        return snailArray;
    }

}
