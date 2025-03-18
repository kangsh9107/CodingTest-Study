package programmers1;

public class Bandage {

    //프로그래머스 Level 1. [PCCP 기출문제] 1번 / 붕대 감기
    //https://school.programmers.co.kr/learn/courses/30/lessons/250137
    public static void main(String[] args) {
        Bandage bandage = new Bandage();

        int[] bandage1 = {5, 1, 5};
        int health1 = 30;
        int[][] attacks1 = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        int result1 = bandage.solution(bandage1, health1, attacks1);
        System.out.println(result1); // 5

        int[] bandage2 = {3, 2, 7};
        int health2 = 20;
        int[][] attacks2 = {{1, 15}, {5, 16}, {8, 6}};
        int result2 = bandage.solution(bandage2, health2, attacks2);
        System.out.println(result2); // -1

        int[] bandage3 = {4, 2, 7};
        int health3 = 20;
        int[][] attacks3 = {{1, 15}, {5, 16}, {8, 6}};
        int result3 = bandage.solution(bandage3, health3, attacks3);
        System.out.println(result3); // -1

        int[] bandage4 = {1, 1, 1};
        int health4 = 5;
        int[][] attacks4 = {{1, 2}, {3, 2}};
        int result4 = bandage.solution(bandage4, health4, attacks4);
        System.out.println(result4); // 3
    }

    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int continuousBandagingSuccessCnt = 0;
        int playTime = attacks[attacks.length - 1][0];
        boolean isHit = false;

        for (int currentTime = 1; currentTime <= playTime; currentTime++) {
            isHit = false;

            for (int i = 0; i < attacks.length; i++) {
                if (currentTime == attacks[i][0]) {
                    isHit = true;
                    health -= attacks[i][1];
                    continuousBandagingSuccessCnt = 0;
                }
            }

            if (!isHit) {
                health = Math.min(health + bandage[1], maxHealth);
                continuousBandagingSuccessCnt++;
            }

            if (continuousBandagingSuccessCnt == bandage[0]) {
                health = Math.min(health + bandage[2], maxHealth);
                continuousBandagingSuccessCnt = 0;
            }

            if (health <= 0) {
                health = -1;
                break;
            }
        }

        return health;
    }

}
