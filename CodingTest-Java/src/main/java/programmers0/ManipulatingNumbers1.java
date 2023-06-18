package main.java.programmers0;

public class ManipulatingNumbers1 {

    /*
     * 프로그래머스 Level 0. 수 조작하기 1
     * https://school.programmers.co.kr/learn/courses/30/lessons/181926
     *
     * 생성일 : 2023-06-18
     * 완료일 : 2023-06-18
     */
    public static void main(String[] args) {
        ManipulatingNumbers1 sol = new ManipulatingNumbers1();

        int n1 = 0;
        String control1 = "wsdawsdassw";
        System.out.println(sol.solution2(n1, control1));
    }

    private int solution(int n, String control) {
        for (String c : control.split("")) {
            if (c.equals("w")) {
                n++;
            } else if (c.equals("s")) {
                n--;
            } else if (c.equals("d")) {
                n += 10;
            } else {
                n -= 10;
            }
        }

        return n;
    }

    private int solution2(int n, String control) {
        int len = control.length();
        int w = len - control.replaceAll("w", "").length();
        int s = len - control.replaceAll("s", "").length();
        int d = len - control.replaceAll("d", "").length();
        int a = len - control.replaceAll("a", "").length();

        n += (w - s + (10 * d) - (10 * a));

        return n;
    }

}
