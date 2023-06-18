package main.java.programmers0;

public class ManipulatingNumbers2 {

    /*
     * 프로그래머스 Level 0. 수 조작하기 2
     * https://school.programmers.co.kr/learn/courses/30/lessons/181925
     *
     * 생성일 : 2023-06-18
     * 완료일 : 2023-06-18
     */
    public static void main(String[] args) {
        ManipulatingNumbers2 sol = new ManipulatingNumbers2();

        int[] log1 = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(sol.solution(log1));
    }

    private String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for (int i=0; i<numLog.length - 1; i++) {
            int cal = numLog[i + 1] - numLog[i];

            if (cal == 1) {
                answer.append("w");
            } else if (cal == -1) {
                answer.append("s");
            } else if (cal == 10) {
                answer.append("d");
            } else {
                answer.append("a");
            }
        }

        return answer.toString();
    }

}
