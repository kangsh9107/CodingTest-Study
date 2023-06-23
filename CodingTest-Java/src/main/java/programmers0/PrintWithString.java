package main.java.programmers0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintWithString {

    /*
     * 프로그래머스 Level 0. 문자열 붙여서 출력하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181946
     *
     * 생성일 : 2023-06-23
     * 완료일 : 2023-06-23
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(str.replaceAll(" ", ""));
    }

}
