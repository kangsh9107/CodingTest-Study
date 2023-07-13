package main.java.programmers1;

public class DesktopCleanup {

    /*
     * 프로그래머스 Level 1. 바탕화면 정리
     * https://school.programmers.co.kr/learn/courses/30/lessons/161990
     *
     * 생성일 : 2023-07-13
     * 완료일 : 2023-07-13
     */
    public static void main(String[] args) {
        DesktopCleanup sol = new DesktopCleanup();

        String[] wallpaper1 = {".#...", "..#..", "...#."};
        System.out.println(sol.solution(wallpaper1));

//        String[] wallpaper2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
//        System.out.println(sol.solution(wallpaper2));
//
//        String[] wallpaper3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
//        System.out.println(sol.solution(wallpaper3));
//
//        String[] wallpaper4 = {"..", "#."};
//        System.out.println(sol.solution(wallpaper4));
    }

    private int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i + 1);
                    rdy = Math.max(rdy, j + 1);
                }
            }
        }

        return new int[]{lux, luy, rdx, rdy};
    }
}
