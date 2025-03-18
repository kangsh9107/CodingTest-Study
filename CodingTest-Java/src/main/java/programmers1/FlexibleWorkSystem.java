package programmers1;

public class FlexibleWorkSystem {

    //프로그래머스 Level 1. 유연근무제
    //https://school.programmers.co.kr/learn/courses/30/lessons/388351?language=java
    public static void main(String[] args) {
        FlexibleWorkSystem flexibleWorkSystem = new FlexibleWorkSystem();

//        int[] schedule1 = {700, 800, 1100};
//        int[][] timelogs1 = {{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}};
//        int startday1 = 5;
//        int result1 = flexibleWorkSystem.solution(schedule1, timelogs1, startday1);
//        System.out.println(result1); // 3

        int[] schedule2 = {730, 855, 700, 720};
        int[][] timelogs2 = {{710, 700, 650, 735, 700, 931, 912}, {908, 901, 805, 815, 800, 831, 835}, {705, 701, 702, 705, 710, 710, 711}, {707, 731, 859, 913, 934, 931, 905}};
        int startday2 = 1;
        int result2 = flexibleWorkSystem.solution(schedule2, timelogs2, startday2);
        System.out.println(result2); // 2
    }

    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int[] evenctSuccessCount = new int[schedules.length];

        for (int i = 0; i < schedules.length; i++) {
            schedules[i] += 10;

            if (schedules[i] % 100 >= 60) {
                schedules[i] += 40;
            }
        }

        for (int i = 0; i < timelogs.length; i++) {
            int day = startday;

            for (int j = 0; j < timelogs[i].length; j++) {
                if (day % 7 == 0 || day % 7 == 6) {
                    evenctSuccessCount[i]++;
                } else {
                    if (timelogs[i][j] <= schedules[i]) {
                        evenctSuccessCount[i]++;
                    }
                }

                day++;
            }

            if (evenctSuccessCount[i] == timelogs[i].length) {
                answer++;
            }
        }

        return answer;
    }

}