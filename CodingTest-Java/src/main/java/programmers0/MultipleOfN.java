package main.java.programmers0;

public class MultipleOfN {

    /*
     * 프로그래머스 Level 0. n의 배수
     * https://school.programmers.co.kr/learn/courses/30/lessons/181937
     *
     * 생성일 : 2023-06-22
     * 완료일 : 2023-06-22
     */
    public static void main(String[] args) {
        MultipleOfN sol = new MultipleOfN();

        int num1 = 98;
        int n1 = 2;
        System.out.println(sol.solution(num1, n1));

//        int num2 = 34;
//        int n2 = 3;
//        System.out.println(sol.solution(num2, n2));
    }

    private int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }

}
