package main.java.programmers0;

public class ConvertCharacterListToString {

    /*
     * 프로그래머스 Level 0. 문자 리스트를 문자열로 변환하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181941
     *
     * 생성일 : 2023-06-22
     * 완료일 : 2023-06-22
     */
    public static void main(String[] args) {
        ConvertCharacterListToString sol = new ConvertCharacterListToString();

        String[] arr1 = {"a", "b", "c"};
        System.out.println(sol.solution(arr1));
    }

    private String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();

        for (String a : arr) {
            answer.append(a);
        }

        return answer.toString();
    }

}
