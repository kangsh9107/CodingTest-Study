package programmers1;

public class FindKim {

	//프로그래머스 Level 1. 서울에서 김서방 찾기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12919
	public static void main(String[] args) {
		FindKim fk = new FindKim();
		
		String[] seoul1 = {"Jane", "Kim"};
		System.out.println(fk.solution(seoul1));
	}
	
    public String solution(String[] seoul) {
        String answer = "";
        
        int index = -1;
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) index = i;
        }
        answer = "김서방은 " + index + "에 있다";
        
        return answer;
    }

}
