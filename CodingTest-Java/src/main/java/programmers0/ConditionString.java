package main.java.programmers0;

public class ConditionString {

    /*
     * 프로그래머스 Level 0. 조건 문자열
     * https://school.programmers.co.kr/learn/courses/30/lessons/181934
     *
     * 생성일 : 2023-06-21
     * 완료일 : 2023-06-21
     */
    public static void main(String[] args) {
        ConditionString sol = new ConditionString();

        String ineq1 = "<";
        String eq1 = "=";
        int n1 = 20;
        int m1 = 50;
        System.out.println(sol.solution(ineq1, eq1, n1, m1));

//        String ineq2 = ">";
//        String eq2 = "!";
//        int n2 = 41;
//        int m2 = 78;
//        System.out.println(sol.solution(ineq2, eq2, n2, m2));
    }

    private int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">") && eq.equals("=")) {
            answer = n >= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            answer = n > m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            answer = n <= m ? 1 : 0;
        } else {
            answer = n < m ? 1 : 0;
        }

        return answer;
    }

}
