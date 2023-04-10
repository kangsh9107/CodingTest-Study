package programmers1;

public class WaterMelon {

	//프로그래머스 Level 1. 수박수박수박수박수박수?
	//https://school.programmers.co.kr/learn/courses/30/lessons/12922
	public static void main(String[] args) {
		WaterMelon wm = new WaterMelon();
		
		int n1 = 3;
		System.out.println(wm.solution(n1));
		
		int n2 = 4;
		System.out.println(wm.solution(n2));
	}
	
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        while(i < n) {
            i++;
            if(i % 2 != 0) sb.append("수");
            else           sb.append("박");
        }
        
        return sb.toString();
    }

}
