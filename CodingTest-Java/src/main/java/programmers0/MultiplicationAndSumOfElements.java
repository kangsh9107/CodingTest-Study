package main.java.programmers0;

public class MultiplicationAndSumOfElements {

    /*
     * 프로그래머스 Level 0. 원소들의 곱과 합
     * https://school.programmers.co.kr/learn/courses/30/lessons/181929
     *
     * 생성일 : 2023-06-19
     * 완료일 : 2023-06-19
     */
    public static void main(String[] args) {
        MultiplicationAndSumOfElements sol = new MultiplicationAndSumOfElements();

        int[] num_list1 = {3, 4, 5, 2, 1};
        System.out.println(sol.solution(num_list1));

//        int[] num_list2 = {5, 7, 8, 3};
//        System.out.println(sol.solution(num_list2));
    }

    private int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;

        for (int n : num_list) {
            mul *= n;
            sum += n;
        }

        return mul < sum * sum ? 1 : 0;
    }

}
