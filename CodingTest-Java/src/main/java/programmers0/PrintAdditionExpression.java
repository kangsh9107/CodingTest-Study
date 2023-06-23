package main.java.programmers0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrintAdditionExpression {

    /*
     * 프로그래머스 Level 0. 덧셈식 출력하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181947
     *
     * 생성일 : 2023-06-23
     * 완료일 : 2023-06-23
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);
    }

}
