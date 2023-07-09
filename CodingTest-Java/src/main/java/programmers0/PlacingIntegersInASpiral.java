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
        int currentRow = 0;
        int lastRow = n - 1;
        int currentCol = 0;
        int lastCol = n - 1;

        while (num <= n * n) {
            // 오른쪽으로 이동
            for (int i = currentCol; i <= lastCol; i++) {
                snailArray[currentRow][i] = num++;
            }
            currentRow++;

            // 아래로 이동
            for (int i = currentRow; i <= lastRow; i++) {
                snailArray[i][lastCol] = num++;
            }
            lastCol--;

            // 왼쪽으로 이동
            for (int i = lastCol; i >= currentCol; i--) {
                snailArray[lastRow][i] = num++;
            }
            lastRow--;

            // 위로 이동
            for (int i = lastRow; i >= currentRow; i--) {
                snailArray[i][currentCol] = num++;
            }
            currentCol++;
        }

        return snailArray;
    }

}
