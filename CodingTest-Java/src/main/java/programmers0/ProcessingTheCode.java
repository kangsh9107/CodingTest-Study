package main.java.programmers0;

public class ProcessingTheCode {

    /*
     * 프로그래머스 Level 0. 코드 처리하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181932
     *
     * 생성일 : 2023-06-20
     * 완료일 : 2023-06-20
     */
    public static void main(String[] args) {
        ProcessingTheCode sol = new ProcessingTheCode();

        String code1 = "abc1abc1abc";
        System.out.println(sol.solution(code1));
    }

    private String solution(String code) {
        StringBuilder answer = new StringBuilder();
        String[] split = code.split("");
        int mod = 0;

        for (int i=0; i<split.length; i++) {
            if (split[i].equals("1")) {
                if (mod == 0) {
                    mod = 1;
                    continue;
                } else {
                    mod = 0;
                    continue;
                }
            }

            if (mod == 1) {
                if (i % 2 != 0) {
                    answer.append(split[i]);
                }
            } else {
                if (i % 2 == 0) {
                    answer.append(split[i]);
                }
            }
        }

        if (answer.length() == 0) {
            answer.append("EMPTY");
        }

        return answer.toString();
    }

}
