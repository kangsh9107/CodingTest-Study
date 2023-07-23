package programmers2;

import java.util.Arrays;

/*
 * 프로그래머스 Level 2. 땅따먹기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12913
 *
 * 생성일 : 2023-07-16
 * 완료일 : 2023-07-22
 */
public class Hopscotch {

    public static void main(String[] args) {
        Hopscotch sol = new Hopscotch();

        int[][] land1 = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};
        System.out.println(sol.solution(land1));
    }

    private int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][2]);
        }

        return Arrays.stream(land[land.length - 1]).max().getAsInt();
    }
}
