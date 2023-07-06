package main.java.programmers0;

import java.util.ArrayList;
import java.util.List;

public class MakeArray2 {

    /*
     * 프로그래머스 Level 0. 배열 만들기 2
     * https://school.programmers.co.kr/learn/courses/30/lessons/181921
     *
     * 생성일 : 2023-07-07
     * 완료일 :
     */
    public static void main(String[] args) {
        MakeArray2 ma = new MakeArray2();

        int l1 = 5;
        int r1 = 555;
        System.out.println(ma.solution(l1, r1));

//        int l2 = 10;
//        int r2 = 20;
//        System.out.println(ma.solution(l2, r2));
    }

    private int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for (int i=l; i<=r; i++) {
            if (containsOnlyZerosAndFives(i)) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            return new int[]{-1};
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean containsOnlyZerosAndFives(int num) {
        String numString = String.valueOf(num);
        for (char c : numString.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }

        return true;
    }
}
