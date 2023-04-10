package programmers1;

public class SumDigit {

	//프로그래머스 Level 1. 자릿수 더하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12931
	public static void main(String[] args) {
		SumDigit sd = new SumDigit();
		
		int N1 = 123;
		System.out.println(sd.solution(N1));
		
		int N2 = 987;
		System.out.println(sd.solution(N2));
	}
	
    public int solution(int n) {
        int answer = 0;

        String[] temp = String.valueOf(n).split("");
        for(String t : temp) {
            answer += Integer.parseInt(t);
        }

        return answer;
    }

}
