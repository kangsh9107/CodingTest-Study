package programmers1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerAscendingOrder {

	//프로그래머스 정수 내림차순으로 배치하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12933
	public static void main(String[] args) {
		IntegerAscendingOrder iao = new IntegerAscendingOrder();
		
		int n1 = 118372;
		System.out.println(iao.solution(n1));
	}
	
    public long solution(long n) {
        long answer = 0;
        
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        String[] temp = String.valueOf(n).split("");
        for(String t : temp) {
            list.add(t);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        for(String l : list) {
            sb.append(l);
        }
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }

}
