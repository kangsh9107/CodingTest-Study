package main.java.programmers0;

public class DiceGame2 {

    /*
     * 프로그래머스 Level 0. 주사위 게임 2
     * https://school.programmers.co.kr/learn/courses/30/lessons/181930
     *
     * 생성일 : 2023-06-19
     * 완료일 : 2023-06-19
     */
    public static void main(String[] args) {
        DiceGame2 sol = new DiceGame2();

        int a1 = 2;
        int b1 = 6;
        int c1 = 1;
        System.out.println(sol.solution(a1, b1, c1));

//        int a2 = 5;
//        int b2 = 3;
//        int c2 = 3;
//        System.out.println(sol.solution(a2, b2, c2));
//
//        int a3 = 4;
//        int b3 = 4;
//        int c3 = 4;
//        System.out.println(sol.solution(a3, b3, c3));
    }

    private int solution(int a, int b, int c) {
        int answer = 0;

        if (a == b && b == c) {
            answer += (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        } else if (a != b && b != c && a != c) {
            answer += a + b + c;
        } else {
            answer += (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }

        return answer;
    }

}
