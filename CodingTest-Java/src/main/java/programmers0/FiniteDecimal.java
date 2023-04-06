package programmers0;

import java.util.ArrayList;
import java.util.List;

public class FiniteDecimal {

	//프로그래머스 Level 0. 유한소수 판별하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120878
	public static void main(String[] args) {
		FiniteDecimal fd = new FiniteDecimal();
		
		int a1 = 7;
		int b1 = 20;
		System.out.println(fd.solution(a1, b1));
		
//		int a2 = 11;
//		int b2 = 22;
//		System.out.println(fd.solution(a2, b2));
//		
//		int a3 = 12;
//		int b3 = 21;
//		System.out.println(fd.solution(a3, b3));
	}
	
    public int solution(int a, int b) {
        int answer = 1;
        int child = 1;
        int parent = 1;
        List<Integer> childList = new ArrayList<>();
        List<Integer> parentList = new ArrayList<>();
        for(int i=2; i<=a; i++) {
        	if(a % i == 0) childList.add(i);
        }
        for(int i=2; i<=b; i++) {
        	if(b % i == 0) parentList.add(i);
        }
        System.out.println(childList);
        System.out.println(parentList);
        
        for(int i=0; i<childList.size(); i++) {
        	for(int j=0; j<parentList.size(); j++) {
        		if(childList.get(i) != parentList.get(j)) child *= childList.get(i);
        	}
        }
        for(int i=0; i<parentList.size(); i++) {
        	for(int j=0; j<childList.size(); j++) {
        		if(parentList.get(i) != childList.get(j)) parent *= parentList.get(i);
        	}
        }
        System.out.println(parent);
        System.out.println(child);
        
        
        return answer;
    }

}
