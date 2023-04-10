package programmers1;

public class PlusMinus {

	//프로그래머스 Level 1. 음양 더하기
	//https://school.programmers.co.kr/learn/courses/30/lessons/76501
	public static void main(String[] args) {
		PlusMinus pm = new PlusMinus();
		
		int[] absolutes1 = {4,7,12};
		boolean[] signs1 = {true,false,true};
		System.out.println(pm.solution(absolutes1, signs1));
		
		int[] absolutes2 = {1,2,3};
		boolean[] signs2 = {false,false,true};
		System.out.println(pm.solution(absolutes2, signs2));
	}
	
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<signs.length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }

}
