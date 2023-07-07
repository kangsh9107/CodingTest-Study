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
        int[][] answer  = new int[n][n];
        int start = 1;
        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;

        while (start <= n * n) {
            // 오른쪽으로 이동
            for (int i = leftCol; i <= rightCol; i++) {
                answer[topRow][i] = start++;
            }
            topRow++;

            // 아래로 이동
            for (int i = topRow; i <= bottomRow; i++) {
                answer[i][rightCol] = start++;
            }
            rightCol--;

            // 왼쪽으로 이동
            for (int i = rightCol; i >= leftCol; i--) {
                answer[bottomRow][i] = start++;
            }
            bottomRow--;

            // 위로 이동
            for (int i = bottomRow; i >= topRow; i--) {
                answer[i][leftCol] = start++;
            }
            leftCol++;
        }

        return answer;
    }

}
