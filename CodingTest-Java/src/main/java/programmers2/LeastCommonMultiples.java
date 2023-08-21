package main.java.programmers2;

/*
 * 프로그래머스 Level 2. N개의 최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 *
 * 생성일 : 2023-08-21
 * 완료일 :
 */
public class LeastCommonMultiples {

    public static void main(String[] args) {
        LeastCommonMultiples sol = new LeastCommonMultiples();

        int[] arr1 = {2, 6, 8, 14};
        System.out.println(sol.solution(arr1));

//        int[] arr2 = {1, 2, 3};
//        System.out.println(sol.solution(arr2));
    }

    private int solution(int[] arr) {
        int answer = arr[0];

        if (arr.length == 1) {
            return answer;
        } else {
            int max = 1;

            for (int i = 0; i < arr.length; i++) {
                max *= arr[i];
            }

            
        }

        return answer;
    }

}