package main.java.programmers0;

public class MultiplyAString {

    /*
     * 프로그래머스 Level 0. 문자열 곱하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181940
     *
     * 생성일 : 2023-06-22
     * 완료일 : 2023-06-22
     */
    public static void main(String[] args) {
        MultiplyAString sol = new MultiplyAString();

        String my_string1 = "string";
        int k1 = 3;
        System.out.println(sol.solution(my_string1, k1));

//        String my_string2 = "love";
//        int k2 = 10;
//        System.out.println(sol.solution(my_string2, k2));
    }

    private String solution(String my_string, int k) {
        return my_string.repeat(k);
    }

}
