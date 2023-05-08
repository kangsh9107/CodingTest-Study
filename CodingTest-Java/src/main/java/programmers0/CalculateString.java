package programmers0;

public class CalculateString {

	//프로그래머스 Level 0. 문자열 계산하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/120902
	public static void main(String[] args) {
		CalculateString cs = new CalculateString();
		
		String my_string1 = "3 + 4";
		System.out.println(cs.solution(my_string1));
	}

	private int solution(String my_string) {
        int answer = 0;
        String[] splitM = my_string.split(" ");
        for(int i=0; i<splitM.length; i++) {
            try {
                answer += Integer.parseInt(splitM[i]);
            } catch(Exception e) {
                if(splitM[i].equals("+")) continue;
                else answer -= (2 * Integer.parseInt(splitM[i+1]));
            }
        }
        return answer;
	}

}
