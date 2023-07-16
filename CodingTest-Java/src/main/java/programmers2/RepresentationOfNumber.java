package main.java.programmers2;

/*
 * 프로그래머스 Level 2. 숫자의 표현
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 *
 * 생성일 : 2023-07-15
 * 완료일 : 2023-07-16
 */
public class RepresentationOfNumber {

    public static void main(String[] args) {
        RepresentationOfNumber sol = new RepresentationOfNumber();

        int n1 = 15;
        System.out.println(sol.solution(n1));
    }

    private int solution(int n) {
        int answer = 0;
        int start = 1;

        for (int i = start; i <= n; i++) {
            int sum = 0;

            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum == n) answer++;
                else if (sum > n) break;
            }
        }

        return answer;
    }
}
