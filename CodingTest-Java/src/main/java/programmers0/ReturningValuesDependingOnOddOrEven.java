package main.java.programmers0;

public class ReturningValuesDependingOnOddOrEven {

    /*
     * 프로그래머스 Level 0. 홀짝에 따라 다른 값 반환하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181935
     *
     * 생성일 : 2023-06-22
     * 완료일 : 2023-06-22
     */
    public static void main(String[] args) {
        ReturningValuesDependingOnOddOrEven sol = new ReturningValuesDependingOnOddOrEven();

        int n1 = 7;
        System.out.println(sol.solution(n1));

//        int n2 = 10;
//        System.out.println(sol.solution(n2));
    }

    private int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i=0; i<=n; i+=2) {
                answer += Math.pow(i, 2);
            }
        } else {
            for (int i=1; i<=n; i+=2) {
                answer += i;
            }
        }

        return answer;
    }

}
