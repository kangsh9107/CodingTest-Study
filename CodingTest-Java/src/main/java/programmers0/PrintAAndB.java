package main.java.programmers0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrintAAndB {

    /*
     * 프로그래머스 Level 0. a와 b 출력하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181951
     *
     * 생성일 : 2023-06-23
     * 완료일 : 2023-06-23
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println("a" + " = " + a);
        System.out.println("b" + " = " + b);
    }

}
