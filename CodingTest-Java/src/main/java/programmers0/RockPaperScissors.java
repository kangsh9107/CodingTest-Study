package programmers0;

public class RockPaperScissors {

	//프로그래머스 Level 0. 가위 바위 보
	//https://school.programmers.co.kr/learn/courses/30/lessons/120839
	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		
		String rsp1 = "2";
		System.out.println(rps.solution(rsp1));
		
		String rsp2 = "205";
		System.out.println(rps.solution(rsp2));
	}

	private String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<rsp.length(); i++) {
            if(rsp.substring(i, i+1).equals("2")) answer.append(0);
            else if(rsp.substring(i, i+1).equals("0")) answer.append(5);
            else answer.append(2);
        }
        return answer.toString();
	}

}
