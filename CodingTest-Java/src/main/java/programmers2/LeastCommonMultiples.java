package main.java.programmers2;

/*
 * 프로그래머스 Level 2. N개의 최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 *
 * 생성일 : 2023-08-21
 * 완료일 : 2023-08-22
 */
public class LeastCommonMultiples {

    public static void main(String[] args) {
        LeastCommonMultiples sol = new LeastCommonMultiples();

        int[] arr1 = {2, 6, 8, 14};
        System.out.println(sol.solution(arr1));

        int[] arr2 = {1, 2, 3};
        System.out.println(sol.solution(arr2));
    }

    private int solution(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            int answer = arr[0];

            for (int i = 0; i < arr.length; i++) {
                answer = lcm(answer, arr[i]);
            }

            return answer;
        }
    }

    // 최대 공약수
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    // 최소 공배수
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

}