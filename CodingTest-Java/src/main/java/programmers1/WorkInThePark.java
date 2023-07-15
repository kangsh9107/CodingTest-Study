package main.java.programmers1;

public class WorkInThePark {

    /*
     * 프로그래머스 Level 1. 공원 산책
     * https://school.programmers.co.kr/learn/courses/30/lessons/172928
     *
     * 생성일 : 2023-07-14
     * 완료일 : 2023-07-
     */
    public static void main(String[] args) {
        WorkInThePark sol = new WorkInThePark();

        String[] park1 = {"SOO","OOO","OOO"};
        String[] routes1 = {"E 2","S 2","W 1"};
        System.out.println(sol.solution(park1, routes1));

//        String[] park2 = {"SOO","OXX","OOO"};
//        String[] routes2 = {"E 2","S 2","W 1"};
//        System.out.println(sol.solution(park2, routes2));
//
//        String[] park3 = {"OSO","OOO","OXO","OOO"};
//        String[] routes3 = {"E 2","S 3","W 1"};
//        System.out.println(sol.solution(park3, routes3));
    }

    private static int robotDogH = 0;
    private static int robotDogW = 0;

    private int[] solution(String[] park, String[] routes) {
        // 로봇 강아지 좌표
        for (int i = 0; i < park.length; i++) {
            if (park[i].indexOf('S') != -1) {
                robotDogH = i;
                robotDogW = park[i].indexOf('S');
                break;
            }
        }

        // 로봇 강아지 이동 명령 확인
        for (int i = 0; i < routes.length; i++) {
            String[] split = routes[i].split(" ");
            String direction = split[0];
            int distance = Integer.parseInt(split[1]);

            isMove(park, direction, distance);
        }

        return new int[]{robotDogH, robotDogW};
    }

    // 로봇 강아지 이동 여부
    private void isMove(String[] park, String direction, int distance) {
        if (direction.equals("E") && robotDogW + distance <= park[0].length() - 1) {
            if (!park[robotDogH].substring(robotDogW, robotDogW + distance + 1).contains("X")) {
                robotDogW += distance;
            }
        } else if (direction.equals("W") && robotDogW - distance >= 0) {
            if (!park[robotDogH].substring(robotDogW - distance, robotDogW + 1).contains("X")) {
                robotDogW -= distance;
            }
        } else if (direction.equals("S") && robotDogH + distance <= park.length - 1) {
            boolean move = true;
            for (int i = robotDogH; i <= robotDogH + distance; i++) {
                if (park[i].substring(robotDogW, robotDogW + 1).equals("X")) {
                    move = false;
                    break;
                }
            }

            if (move) robotDogH += distance;
        } else if (direction.equals("N") && robotDogH - distance >= 0) {
            boolean move = true;
            for (int i = robotDogH; i >= robotDogH - distance; i--) {
                if (park[i].substring(robotDogW, robotDogW + 1).equals("X")) {
                    move = false;
                    break;
                }
            }

            if (move) robotDogH -= distance;
        }
    }
}
