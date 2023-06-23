package main.java.programmers0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeUppercaseAndLowercaseLetters {

    /*
     * 프로그래머스 Level 0. 대소문자 바꿔서 출력하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181949
     *
     * 생성일 : 2023-06-23
     * 완료일 : 2023-06-23
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (char s : str.toCharArray()) {
            if (s - 0 >= 97) {
                System.out.print(Character.toString(s).toUpperCase());
            } else {
                System.out.print(Character.toString(s).toLowerCase());
            }
        }
    }

}
