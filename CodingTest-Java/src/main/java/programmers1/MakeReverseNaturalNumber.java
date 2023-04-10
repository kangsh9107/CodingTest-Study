package programmers1;

import java.util.ArrayList;
import java.util.List;

public class MakeReverseNaturalNumber {

	//프로그래머스 Level 1. 자연수 뒤집어 배열로 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12932
	public static void main(String[] args) {
		MakeReverseNaturalNumber mrnn = new MakeReverseNaturalNumber();
		
		int n1 = 12345;
		System.out.println(mrnn.solution(n1));
	}
	
    public List<Integer> solution(long n) {
        List<Integer> answer = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n));
        sb.reverse();
        String[] temp = sb.toString().split("");
        for(String t : temp) {
            answer.add(Integer.parseInt(t));
        }
        
        return answer;
    }

}
