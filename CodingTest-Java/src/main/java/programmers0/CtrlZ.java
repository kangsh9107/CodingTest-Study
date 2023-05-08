package programmers0;

public class CtrlZ {

	//프로그래머스 Level 0. 컨트롤 제트
	//https://school.programmers.co.kr/learn/courses/30/lessons/120853
	public static void main(String[] args) {
		CtrlZ cz = new CtrlZ();
		
		String s1 = "1 2 Z 3";
		System.out.println(cz.solution(s1));
		
		String s2 = "10 20 30 40";
		System.out.println(cz.solution(s2));
		
		String s3 = "10 Z 20 Z 1";
		System.out.println(cz.solution(s3));
		
		String s4 = "10 Z 20 Z";
		System.out.println(cz.solution(s4));
		
		String s5 = "-1 -2 -3 Z";
		System.out.println(cz.solution(s5));
	}

	private int solution(String s) {
        int answer = 0;
        String[] splitS = s.split(" ");
        for(int i=0; i<splitS.length; i++) {
            if(splitS[i].equals("Z")) answer += Integer.parseInt(splitS[i-1]) * (-1);
            else answer += Integer.parseInt(splitS[i]);
        }
        return answer;
	}

}
