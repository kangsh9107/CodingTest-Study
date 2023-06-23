package main.java.programmers0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TurnTheString {

    /*
     * 프로그래머스 Level 0. 문자열 돌리기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181945
     *
     * 생성일 : 2023-06-23
     * 완료일 : 2023-06-23
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        br.close();
    }

}
