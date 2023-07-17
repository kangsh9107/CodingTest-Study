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
        int sum = 0;

        boolean[] visited = new boolean[land[0].length];
        for (int i = 0; i < land.length; i++) {
            sum = 0;

            combination(land[i], visited, 0, land[0].length, land[0].length - 1);
        }

        return answer;
    }

    private void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    private void print(int[] arr, boolean[] visited, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(visited[i]) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
