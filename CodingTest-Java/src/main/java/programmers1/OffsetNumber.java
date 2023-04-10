package programmers1;

import java.util.ArrayList;
import java.util.List;

public class OffsetNumber {

	//프로그래머스 Level 1. x만큼 간격이 있는 n개의 숫자
	//https://school.programmers.co.kr/learn/courses/30/lessons/12954
	public static void main(String[] args) {
		OffsetNumber on = new OffsetNumber();
		
		int x1 = 2;
		int n1 = 5;
		System.out.println(on.solution(x1, n1));
		
		int x2 = 4;
		int n2 = 3;
		System.out.println(on.solution(x2, n2));
		
		int x3 = -4;
		int n3 = 2;
		System.out.println(on.solution(x3, n3));
	}
	
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            answer.add((long)x*i);
        }
        
        return answer;
    }

}
