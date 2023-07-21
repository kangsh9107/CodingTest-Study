package main.java.programmers2;

import java.util.ArrayList;
import java.util.List;

/*
 * 프로그래머스 Level 2. 땅따먹기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12913
 *
 * 생성일 : 2023-07-16
 * 완료일 :
 */
public class Hopscotch {

    public static void main(String[] args) {
        Hopscotch sol = new Hopscotch();

        int[][] land1 = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};
        System.out.println(sol.solution(land1));
    }

    private int solution(int[][] land) {
        int answer = 0;
        List<Integer> sum = new ArrayList<>();

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {

            }
        }

        return answer;
    }
}
