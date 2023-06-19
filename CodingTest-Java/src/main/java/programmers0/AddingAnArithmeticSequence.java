package main.java.programmers0;

public class AddingAnArithmeticSequence {

    /*
     * 프로그래머스 Level 0. 등차수열의 특정한 항만 더하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/181931
     *
     * 생성일 : 2023-06-19
     * 완료일 : 2023-06-19
     */
    public static void main(String[] args) {
        AddingAnArithmeticSequence sol = new AddingAnArithmeticSequence();

        int a1 = 3;
        int d1 = 4;
        boolean[] included1 = {true, false, false, true, true};
        System.out.println(sol.solution(a1, d1, included1));

//        int a2 = 7;
//        int d2 = 1;
//        boolean[] included2 = {false, false, false, true, false, false, false};
//        System.out.println(sol.solution(a2, d2, included2));
    }

    private int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i=0; i<included.length; i++) {
            if (included[i]) {
                answer += a + (d * i);
            }
        }

        return answer;
    }

}
