package main.java.programmers0;

public class OverwriteString {

    /*
     * 프로그래머스 Level 0. 문자열 겹쳐쓰기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181943
     *
     * 생성일 : 2023-06-23
     * 완료일 : 2023-06-23
     */
    public static void main(String[] args) {
        OverwriteString sol = new OverwriteString();

        String my_string1 = "He11oWor1d";
        String overwrite_string1 = "lloWorl";
        int s1 = 2;
        System.out.println(sol.solution(my_string1, overwrite_string1, s1));

//        String my_string2 = "Program29b8UYP";
//        String overwrite_string2 = "merS123";
//        int s2 = 7;
//        System.out.println(sol.solution(my_string2, overwrite_string2, s2));
    }

    private String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }

}
