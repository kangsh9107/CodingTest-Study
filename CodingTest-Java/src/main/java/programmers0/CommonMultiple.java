package main.java.programmers0;

public class CommonMultiple {

    /*
     * 프로그래머스 Level 0. 공배수
     * https://school.programmers.co.kr/learn/courses/30/lessons/181936
     *
     * 생성일 : 2023-06-22
     * 완료일 : 2023-06-22
     */
    public static void main(String[] args) {
        CommonMultiple sol = new CommonMultiple();

        int number1 = 60;
        int n1 = 2;
        int m1 = 3;
        System.out.println(sol.solution(number1, n1, m1));

//        int number2 = 55;
//        int n2 = 10;
//        int m2 = 5;
//        System.out.println(sol.solution(number2, n2, m2));
    }

    private int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }

}
