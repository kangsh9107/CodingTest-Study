package main.java.programmers0;

public class ComparingTheOperationValueOfTwoNumbers {

    /*
     * 프로그래머스 Level 0. 두 수의 연산값 비교하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181938
     *
     * 생성일 : 2023-06-22
     * 완료일 : 2023-06-22
     */
    public static void main(String[] args) {
        ComparingTheOperationValueOfTwoNumbers sol = new ComparingTheOperationValueOfTwoNumbers();

        int a1 = 2;
        int b1 = 91;
        System.out.println(sol.solution(a1, b1));

//        int a2 = 91;
//        int b2 = 2;
//        System.out.println(sol.solution(a2, b2));
    }

    private int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), 2 * a * b);
    }

}
