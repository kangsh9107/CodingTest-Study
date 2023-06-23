package main.java.programmers0;

import java.util.Scanner;

public class OddsAndEnds {

    /*
     * 프로그래머스 Level 0. 홀짝 구분하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181944
     *
     * 생성일 : 2023-06-23
     * 완료일 : 2023-06-23
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

}
