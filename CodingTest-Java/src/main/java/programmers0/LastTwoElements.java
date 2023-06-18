package main.java.programmers0;

public class LastTwoElements {

    /*
     * 프로그래머스 Level 0. 수 조작하기 1
     * https://school.programmers.co.kr/learn/courses/30/lessons/181926
     *
     * 생성일 : 2023-06-18
     * 완료일 : 2023-06-18
     */
    public static void main(String[] args) {
        LastTwoElements sol = new LastTwoElements();

        int[] num_list1 = {2, 1, 6};
        System.out.println(sol.solution(num_list1));

//        int[] num_list2 = {5, 2, 1, 7, 5};
//        System.out.println(sol.solution(num_list2));
    }

    private int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        for (int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }

        return answer;
    }

}
