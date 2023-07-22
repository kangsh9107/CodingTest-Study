package programmers0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrintAStringRepeatedly {

    /*
     * 프로그래머스 Level 0. 문자열 반복해서 출력하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181950
     *
     * 생성일 : 2023-06-23
     * 완료일 : 2023-06-23
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int cnt = Integer.parseInt(st.nextToken());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            answer.append(str);
        }
        System.out.println(answer.toString());
    }

}
