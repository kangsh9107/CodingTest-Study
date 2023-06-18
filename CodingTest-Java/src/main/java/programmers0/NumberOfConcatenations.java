package main.java.programmers0;

public class NumberOfConcatenations {

    /*
     * 프로그래머스 Level 0. 이어 붙인 수
     * https://school.programmers.co.kr/learn/courses/30/lessons/181928
     *
     * 생성일 : 2023-06-18
     * 완료일 : 2023-06-18
     */
    public static void main(String[] args) {
        NumberOfConcatenations sol = new NumberOfConcatenations();

        int[] num_list1 = {3, 4, 5, 2, 1};
        System.out.println(sol.solution(num_list1));

//        int[] num_list2 = {5, 7, 8, 3};
//        System.out.println(sol.solution(num_list2));
    }

    private int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even.append(num_list[i]);
            } else {
                odd.append(num_list[i]);
            }
        }

        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }

}
