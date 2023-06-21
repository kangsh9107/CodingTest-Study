package main.java.programmers0;

public class ReturnDifferentValuesDependingOnTheFlag {

    /*
     * 프로그래머스 Level 0. 코드 처리하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181932
     *
     * 생성일 : 2023-06-21
     * 완료일 : 2023-06-21
     */
    public static void main(String[] args) {
        ReturnDifferentValuesDependingOnTheFlag sol = new ReturnDifferentValuesDependingOnTheFlag();

        int a1 = -4;
        int b1 = 7;
        boolean flag1 = true;
        System.out.println(sol.solution(a1, b1, flag1));

//        int a2 = -4;
//        int b2 = 7;
//        boolean flag2 = false;
//        System.out.println(sol.solution(a2, b2, flag2));
    }

    private int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

}
