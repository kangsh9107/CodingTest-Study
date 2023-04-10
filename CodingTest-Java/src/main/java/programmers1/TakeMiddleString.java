package programmers1;

public class TakeMiddleString {

	//프로그래머스 Level 1. 가운데 글자 가져오기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12903
	public static void main(String[] args) {
		TakeMiddleString tms = new TakeMiddleString();
		
		String s1 = "abcde";
		System.out.println(tms.solution(s1));
		
		String s2 = "qwer";
		System.out.println(tms.solution(s2));
	}
	
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        if(s.length() == 1) {
            sb.append(s);
        } else if(s.length() % 2 ==0) {
            sb.append(s.substring((s.length()/2)-1, (s.length()/2)+1));
        } else {
            sb.append(s.substring((int)(s.length()/2), (int)(s.length()/2)+1));
        }
        
        return sb.toString();
    }

}
