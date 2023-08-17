package main.java.programmers2;

/*
 * 프로그래머스 Level 2. 124 나라의 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12899
 *
 * 생성일 : 2023-07-23
 * 완료일 :
 */
public class OneTwoFourCountry {

    public static void main(String[] args) {
        OneTwoFourCountry sol = new OneTwoFourCountry();

        int n1 = 1;
        System.out.println(sol.solution(n1));

        int n2 = 2;
        System.out.println(sol.solution(n2));

        int n3 = 3;
        System.out.println(sol.solution(n3));

        int n4 = 4;
        System.out.println(sol.solution(n4));

        int n5 = 5;
        System.out.println(sol.solution(n5));

        int n6 = 6;
        System.out.println(sol.solution(n6));

        int n7 = 7;
        System.out.println(sol.solution(n7));

        int n8 = 8;
        System.out.println(sol.solution(n8));

        int n9 = 9;
        System.out.println(sol.solution(n9));

        int n10 = 10;
        System.out.println(sol.solution(n10));
    }

    private String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            int remainder = n % 3;
            n /= 3;

            if (remainder == 0) {
                remainder = 4;
                n--;
            }

            answer.append(remainder);
        }

        return answer.reverse().toString();
    }
}
