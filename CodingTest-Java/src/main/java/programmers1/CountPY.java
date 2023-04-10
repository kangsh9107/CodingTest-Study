package programmers1;

public class CountPY {

	//프로그래머스 Level 1. 문자열 내 p와 y의 개수
	//https://school.programmers.co.kr/learn/courses/30/lessons/12916
	public static void main(String[] args) {
		CountPY cpy = new CountPY();
		
		String s1 = "pPoooyY";
		System.out.println(cpy.solution(s1));
		
		String s2 = "Pyy";
		System.out.println(cpy.solution(s2));
	}
	
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        String[] temp = s.split("");
        for(String t : temp) {
            t = t.toLowerCase();
            
            if(t.equals("p")) p++;
            else if(t.equals("y")) y++;
        }
        
        if(p != y) answer = false;

        return answer;
    }

}
