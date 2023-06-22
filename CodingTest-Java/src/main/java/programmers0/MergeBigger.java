package main.java.programmers0;

public class MergeBigger {

    /*
     * 프로그래머스 Level 0. 더 크게 합치기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181939
     *
     * 생성일 : 2023-06-22
     * 완료일 : 2023-06-22
     */
    public static void main(String[] args) {
        MergeBigger sol = new MergeBigger();

        int a1 = 9;
        int b1 = 91;
        System.out.println(sol.solution(a1, b1));

//        int a2 = 89;
//        int b2 = 8;
//        System.out.println(sol.solution(a2, b2));
    }

    private int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }

}
