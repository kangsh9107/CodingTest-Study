package main.java.programmers0;

public class ShuffleStrings {

    /*
     * 프로그래머스 Level 0. 문자열 섞기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181942
     *
     * 생성일 : 2023-06-22
     * 완료일 : 2023-06-22
     */
    public static void main(String[] args) {
        ShuffleStrings sol = new ShuffleStrings();

        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(sol.solution(str1, str2));
    }

    private String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();

        for (int i=0; i<str1.length(); i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }

        return answer.toString();
    }

}
