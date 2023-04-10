package programmers1;

public class StrangeString {

	//프로그래머스 Level 1. 이상한 문자 만들기
	//https://school.programmers.co.kr/learn/courses/30/lessons/12930
	public static void main(String[] args) {
		StrangeString ss = new StrangeString();
		
		String s1 = "try hello world";
		System.out.println(ss.solution(s1));
		
		String s2 = "a   b  c";
		System.out.println(ss.solution(s2));
	}
	
	String solution(String s) {
		StringBuilder sb = new StringBuilder();
        String[] temp = s.split("");
        int index = 0;
        
        for(int i=0; i<temp.length; i++) {
            if(temp[i].equals(" ")) {
            	sb.append(" ");
            	index = 0;
            } else {
            	if(index%2 == 0) {
            		sb.append(temp[i].toUpperCase());
            		index++;
            	} else {
            		sb.append(temp[i].toLowerCase());
            		index++;
            	}
            }
        }
		
		return sb.toString();
	}

}
